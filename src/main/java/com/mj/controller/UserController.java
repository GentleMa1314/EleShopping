package com.mj.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mj.model.*;
import com.mj.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //用户注册
    @RequestMapping("/adduser")
    public String addUser(String uusername, String upassword, String uname,
                          String usex, String uphone, String uaddress, Model model){

        if(userService.checkUser(uusername)!=null){

            model.addAttribute("alreadyUser","此用户名已存在");
            return "user_regist";
        }else{

            User user = new User(0,uusername,upassword,uname,usex,uphone,uaddress);
            userService.addUser(user);

            return "user_index";
        }

    }
    //用户登录
    @RequestMapping("/login")
    public String login(String uusername, String upassword, HttpSession session,Model model){

        User u=userService.checkLogin(uusername,upassword);
        if(u!=null){

            session.setAttribute("user",u);
            session.setMaxInactiveInterval(1800);
            System.out.println(u);
            return "user_index";
        }else{
            model.addAttribute("loginError","账户名或密码错误");
            return "user_login";
        }
    }
    //
    @RequestMapping(value="/checkSession")//我的账户登陆检验
    public String checkSession(int id,String cname,HttpSession session,Model model){
        System.out.println(cname);
        if(id==1){

            if(session.getAttribute("user")!=null){

                if(cname==null){
                    User user=(User)session.getAttribute("user");
                    List<cands> shopLists=userService.selectshopCart(user.getUname());
                    model.addAttribute("lists",shopLists);
                    return "user_cart";
                }else{
                    User user=(User)session.getAttribute("user");
                    userService.insertintoShopCart(user.getUname(),cname);//添加进购物车
                    System.out.println(user.getUname()+cname);

                    List<cands> shopLists=userService.selectshopCart(user.getUname());
                    System.out.println(shopLists);
                    model.addAttribute("lists",shopLists);

                    //userService.
                    return "user_cart";
                }


            }else{
                model.addAttribute("nologin","请先登录");

                System.out.println("先去登陆");
                return "user_login";
            }

        }
        else if(id==2){
                if(session.getAttribute("user")!=null){

                    System.out.println(session.getAttribute("user"));
                    return "changeUserInfo";
                }else{
                    model.addAttribute("nologin","请先登录");
                    System.out.println("先去登陆");
                    return "user_login";
                }

        }
        else if(id==3){
            if(session.getAttribute("user")!=null){
                User user=(User)session.getAttribute("user");
                List<cands> shopLists=userService.selectshopCart(user.getUname());
                model.addAttribute("lists",shopLists);
                model.addAttribute("nomoney","您的账户余额不足，请联系管理员充值");
                return "user_cart";
            }
        }
        return null;
    }
    //用户注销
    @RequestMapping("/sessionDelete")
    public String sessionDelete(HttpSession session, Model model){

        if(session.getAttribute("user")==null){

            return "user_index";

        }
        else{
            session.invalidate();//session注销
            model.addAttribute("sessionDeleteOther","请先登录");
            return "user_login";
        }
    }

    @RequestMapping("/addBusiness")
    public String addBusiness(String bname,String bpassword,String bphone,String bcode,Model model){

        if(userService.checkBusiness(bcode)!=null){

            model.addAttribute("alreadyBusiness","此商家编号已存在");
            return "shop_regist";
        }else{
           business bus=new business(0,bname,bpassword,bphone,bcode,0);
            System.out.println(bus);
            userService.addBusiness(bus);
            return "user_index";
        }
    }


    //用户修改个人信息
    @ResponseBody
    @RequestMapping("/updateUser")
    public String updateUserInfo(@RequestBody User user){
        this.userService.updateUserInfo(user);
        System.out.println("信息更新成功");
        return "100";
    }

    //检索商品
    @RequestMapping("/productSearch")
    public String productSearch(String ss,Model model){
        System.out.println(ss);
        List<commodity> products =userService.selectFuzzy(ss);
        if(products.size()==0){
            model.addAttribute("Noproducts","没有相关商品");
        }
        System.out.println(products);
        model.addAttribute("products",products);
        return "user_shop-list";
    }
/*
    @RequestMapping("/pageInfo")
    public String pageInfo(String ss,@RequestParam("pageNum") int pageNum,@RequestParam("pageSize") int pageSize,HttpServletRequest request,Model model){

        System.out.println(pageNum+pageSize);
        PageHelper.startPage(pageNum,pageSize);
        JSONObject jsonObject=new JSONObject();
        List<commodity> products=userService.selectFuzzy(ss);

        PageInfo<commodity> pageInfo=new PageInfo<>(products);
        model.addAttribute("pageinfo",pageInfo);
        return "user_shop-list";


    }*/



    //移除购物车的某一项
    @RequestMapping("/deleteShopping")
    public ModelAndView deleteShopping(int sid, String cname, HttpServletRequest request, Model model){

        ModelAndView mv=new ModelAndView();
        mv.setViewName("redirect:/checkSession?id=1");
        userService.deleteShopping(sid);
        return mv;
    }
    @RequestMapping("/checkOrder")
    public ModelAndView checkOrder(String hiddeninput,String oremark,HttpSession session,Model model){

        User user=(User)session.getAttribute("user");
        String uusername=user.getUusername();
        String ss=hiddeninput;
        System.out.println(ss);
        int oallprice=0;
        oallprice=Integer.parseInt(ss);

        if(userService.checkOrder(uusername)<oallprice){
           /* model.addAttribute("nomoney","您的账户余额不足，请联系管理员充值");*/
            ModelAndView mv=new ModelAndView();
            mv.setViewName("redirect:/checkSession?id=3");
            return mv;
        }else{
            SimpleDateFormat dff=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date=new Date();
            String osubdate=dff.format(date);
            System.out.println(osubdate);
            String uname=user.getUname();

            StringBuilder str=new StringBuilder();
            Random random=new Random();
            for(int i=0;i<11;i++){
                str.append(random.nextInt(10));
            }
            String oserialnumber=str.toString();
            System.out.println(oserialnumber);
            Uorder uorder=new Uorder(0,uname,oremark,oallprice,osubdate,1,0,"0",oserialnumber,0);
            System.out.println(uorder);
            userService.insertintoUorder(uorder);
            userService.ReduceUser(user.getUusername(),oallprice);
            userService.addManager(1,oallprice);
            userService.deleteshoppings(user.getUname());
            ModelAndView mv=new ModelAndView();
            mv.setViewName("redirect:/myOrder");
            return mv;
        }

    }

    @RequestMapping("/myOrder")
    public  String myOrder(HttpSession session,Model model){

        User user =(User)session.getAttribute("user");
        List<Uorder> userorder=userService.selectUserOrder(user.getUname());
        model.addAttribute("userorder",userorder);
        return "user_order";
    }

    @RequestMapping("/ReceiveShop")
    public ModelAndView ReceiveShop(int oid,String uname,Model model,HttpSession session){


        if(userService.checkIsReceive(oid,uname)==1){
            userService.deleteUorder(oid,uname);
            model.addAttribute("alreadyReceive","您已经确认收货该商品");
            ModelAndView mv=new ModelAndView();
            mv.setViewName("forward:/myOrder");
            return mv;
        }else{
            userService.ReceiveShop(oid,uname);
            model.addAttribute("receiveSucess","确认收货成功");
            ModelAndView mv=new ModelAndView();
            mv.setViewName("forward:/myOrder");
            return mv;

        }
    }








}

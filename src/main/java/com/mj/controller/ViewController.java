package com.mj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ViewController {



    @RequestMapping("/userindex")
    public String index(){
        return "user_index";
    }

    @RequestMapping("/userlogin")
    public String login(){
        return "user_login";
    }

    @RequestMapping("/userregist")
    public String regist(){
        return "user_regist";
    }

    @RequestMapping("/user404")
    public String errors(){
        return "user_404";
    }

    @RequestMapping("/userabout")
    public String about(){
        return "user_about";
    }

    @RequestMapping("/userblog")
    public String blog(){
        return "user_blog";
    }

    @RequestMapping("/userblog-details")
    public String details(){
        return "user_blog-detail";
    }

    @RequestMapping("/usercart")
    public String cart(){
        return "user_cart";
    }

    @RequestMapping("/changeUserInfo")
    public String changeUserInfo(){
        return "changeUserInfo";
    }

    @RequestMapping("/usercheckout")
    public String checkout(){
        return "user_checkout";
    }

    @RequestMapping("/usercontact")
    public String contact(){
        return "user_contact";
    }
    @RequestMapping("/usershop-list")
    public String shopList(){
        return "user_shop-list";
    }

    @RequestMapping("/usershop_regist")
    public String shop_regist(){
        return "shop_regist";
    }

    @RequestMapping("/userproduct-details")
    public String product_details(){
        return "user_product-details";
    }




}

package com.mj.mapper;

import com.mj.model.*;

import java.util.List;

public interface UserMapper {

    public void addUser(User user);//添加进用户信息表
    public User checkUser(String uusername);//校验用户名是否注册
    public User checkLogin(String uusername,String upassword);//校验用户登录
    public void updateUserInfo(User user);//更新个人信息
    public List<commodity> selectFuzzy(String s);//模糊检索商品
    public  void insertintoShopCart(String uname,String cname);//保存到购物车
    public List<cands> selectshopCart(String uname);//查询用户购物车
    public void deleteShopping(int sid);//移除购物车中的某一项
    public int checkOrder(String uusername);//检验用户账户余额是小于商品价格
    public void insertintoUorder(Uorder uorder);//提交订单
    public business checkBusiness(String bcode);//检验商家编号是否注册
    public void addBusiness(business bus);//添加进商家表
    public void ReduceUser(String uusername,int uaccount);//用户扣费
    public void addManager(int pid,int paccount);//管理员入账
    public void deleteshoppings(String uname);//清空购物车
    public List<Uorder> selectUserOrder(String uname);//查询我的订单
    public void ReceiveShop(int oid,String uname);//用户确认收货
    public int checkIsReceive(int oid,String uname);//校验是否收货
    public void deleteUorder(int oid,String uname);//删除已经确认过的订单
    public int selectCount(String ss);//模糊查询记录总数
    public List<commodity> selectBylimit(String goods,int currentPageNumber);//分页查询商品
}

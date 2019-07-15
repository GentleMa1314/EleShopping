package com.mj.service;


import com.mj.model.*;

import java.util.List;

public interface UserService {

    void addUser(User user);
    User checkUser(String uusername);
    User checkLogin(String uusername,String upassword);
    void updateUserInfo(User user);
    List<commodity> selectFuzzy(String s);
    void insertintoShopCart(String uname,String cname);
    List<cands> selectshopCart(String uname);
    void deleteShopping(int sid);
    int checkOrder(String uusername);
    void insertintoUorder(Uorder uorder);
    business checkBusiness(String bcode);
    void addBusiness(business bus);
    void ReduceUser(String uusername,int uaccount);
    void addManager(int pid,int paccount);
    void deleteshoppings(String uname);
    List<Uorder> selectUserOrder(String uname);
    void ReceiveShop(int oid,String uname);
    int checkIsReceive(int oid,String uname);
    void deleteUorder(int oid,String uname);



}

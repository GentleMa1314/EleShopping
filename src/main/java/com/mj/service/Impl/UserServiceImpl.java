package com.mj.service.Impl;


import com.mj.mapper.UserMapper;
import com.mj.model.*;
import com.mj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //注册用户
    @Override
    public void addUser(User user) {

        userMapper.addUser(user);
    }
    //校验注册用户是否存在


    @Override
    public User checkUser(String uusername) {
        return userMapper.checkUser(uusername);
    }

    @Override
    public User checkLogin(String uusername, String upassword) {
        return userMapper.checkLogin(uusername,upassword);
    }

    @Override
    public void updateUserInfo(User user) {
        userMapper.updateUserInfo(user);
    }

    @Override
    public List<commodity> selectFuzzy(String s) {
        return userMapper.selectFuzzy(s);
    }

    @Override
    public void insertintoShopCart(String uname, String cname) {
        userMapper.insertintoShopCart(uname,cname);
    }

    @Override
    public List<cands> selectshopCart(String uname) {
        //return selectshopCart(uname);
        return userMapper.selectshopCart(uname);
    }

    @Override
    public void deleteShopping(int sid) {
        userMapper.deleteShopping(sid);
    }

    @Override
    public int checkOrder(String uusername) {
        return userMapper.checkOrder(uusername);
    }

    @Override
    public void insertintoUorder(Uorder uorder) {
        userMapper.insertintoUorder(uorder);
    }

    @Override
    public business checkBusiness(String bcode) {
        return userMapper.checkBusiness(bcode);
    }

    @Override
    public void addBusiness(business bus) {
        userMapper.addBusiness(bus);
    }

    @Override
    public void ReduceUser(String uusername, int uaccount) {
        userMapper.ReduceUser(uusername,uaccount);
    }

    @Override
    public void addManager(int pid, int paccount) {
        userMapper.addManager(pid,paccount);
    }

    @Override
    public void deleteshoppings(String uname) {
        userMapper.deleteshoppings(uname);
    }

    @Override
    public List<Uorder> selectUserOrder(String uname) {
        return userMapper.selectUserOrder(uname);
    }

    @Override
    public void ReceiveShop(int oid, String uname) {
        userMapper.ReceiveShop(oid,uname);
    }

    @Override
    public int checkIsReceive(int oid, String uname) {
        return userMapper.checkIsReceive(oid,uname);
    }

    @Override
    public void deleteUorder(int oid, String uname) {
        userMapper.deleteUorder(oid,uname);
    }
}

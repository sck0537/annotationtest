package org.example.dao.impl;

import org.example.dao.UserDao;

import org.springframework.stereotype.Repository;
//    <bean id="userDao" class="java.test.dao.impl.UserDaoImpl"/>

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save(){
        System.out.println("save running");
    }
}

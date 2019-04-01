package com.ssh.dao;

import com.ssh.bean.User;
import com.ssh.util.HibernateUtil;
import org.hibernate.Session;

public class UserDao {
    public static void main(String[] args){
        Session session= HibernateUtil.currentSession();
        User user=session.get(User.class,"1");
        session.close();
        System.out.println(user.toString());
    }
//    public void addUser(User user){
//        Session session= HibernateUtil.openSession();
//        Transaction transaction=session.beginTransaction();
//        session.save(user);
//        transaction.commit();
//        session.close();
//    }
}

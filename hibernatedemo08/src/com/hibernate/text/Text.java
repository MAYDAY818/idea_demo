package com.hibernate.text;

import com.hibernate.bean.User;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.login.Configuration;

public class Text {
    public static void main(String[] args){
//        Session session= HibernateUtil.currentSession();
//        User user=session.get(User.class,"1");
//        session.close();
//        System.out.println(user.toString());
        // 打开线程安全的Session对象
        Session session = HibernateUtil.openSession();
        // 打开事务
        Transaction tx = session.beginTransaction();
        // 创建Person对象

        session.get(User.class,"1");
        tx.commit();
        //通过工具类关闭Session
        session.close();

    }
}

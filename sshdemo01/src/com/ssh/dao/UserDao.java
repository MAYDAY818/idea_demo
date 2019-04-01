package com.ssh.dao;

import com.ssh.bean.User;
import com.ssh.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {
    public void addUser(User user){
        Session session= HibernateUtil.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }
}

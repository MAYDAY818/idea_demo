package com.hibernate.ui;

import com.hibernate.entity.User;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {

        User u = new User(1,"李四","12345");
        Test t = new Test();
        t.saveUser(u);
    }

    public void saveUser(User u) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(u);
        transaction.commit();
        session.close();
    }

    public void updateUser(User u) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(u);
        transaction.commit();
        session.close();
    }

    public User findUserById(int id) {
        Session session = HibernateUtil.openSession();
        User u = session.get(User.class, id);
        session.close();
        return u;
    }

    public void deleteUser(User u) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(u);
        transaction.commit();
        session.close();
    }
}

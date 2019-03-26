package com.hibernate.ui;

import com.hibernate.entity.Adress;
import com.hibernate.entity.Customer;
import com.hibernate.entity.Good;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

import javax.persistence.Query;
import java.util.List;

public class Text {
    public static void main(String[] args) {

        Customer customer=new Customer("xiao","12344","133435");
        Text t = new Text();
        t.addCustomer(customer);
    }

    public void addGood(Good good){
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(good);
        transaction.commit();
        session.close();
    }
    public void addCustomer(Customer customer){
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }
    public void addAdress(Customer customer, Adress adress){
        Session session=HibernateUtil.openSession();
        Transaction transaction =session.beginTransaction();
        customer.getAdresses().add(adress);
        adress.setCustomer(customer);
        session.update(customer);
        transaction.commit();
        session.close();
    }
    public void updateCustomer(Customer customer){
        Session session=HibernateUtil.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(customer);
        transaction.commit();
        session.close();
    }
    public Customer findCustomerById(int id){
        Session session=HibernateUtil.openSession();
        Customer customer=session.get(Customer.class,id);
        session.close();
        return customer;
    }
    public void deleteUser(Customer customer) {
        //打开session
        Session session = HibernateUtil.openSession();
        //开启数据库事务
        Transaction transaction = session.beginTransaction();
        //删除
        session.delete(customer);
        //提交数据库事务
        transaction.commit();
        //关闭session
        session.close();
    }
    public void addGood(Customer customer,Good good){
        Session session=HibernateUtil.openSession();
        Transaction transaction=session.beginTransaction();
        customer.getShoppingCart().getGoodSet().add(good);
        good.getShoppingCarts().add(customer.getShoppingCart());
        session.update(customer);
        transaction.commit();
        session.close();
    }
    public void deleteCustomer(Customer customer){
        Session session=HibernateUtil.openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(customer);
        transaction.commit();
        session.close();
    }
    public void findCustomerByIdOrName(int id,String name){
        Session session=HibernateUtil.openSession();
//        StringBuffer hql=new StringBuffer("from customer u");
//        if( id != 0 && name != null){
//            hql.append("where u.id=? and u.name=?");
//            Query query = session.createQuery(hql.toString());
//            query.setParameter(0,id);
//            query.setParameter(1,name);
//        }
//        if( id == 0 && name != null){
//            hql.append("where u.name=?");
//            Query query = session.createQuery(hql.toString());
//            query.setParameter(0,name);
//        }
//
//        if( id != 0 && name == null){
//            hql.append("where u.id=? ");
//            Query query=session.createQuery(hql.toString());
//            query.setParameter(0,name);
//        }




//        //使用criteria
//        Criteria criteria=session.createCriteria(Customer.class);
//        if (null != name){
//            Criteria c1 = Restrictions.eq("id",id);
//            criteria.add(c1);
//        }

        //本地sql查询
        String sql ="select * from customer ";
        NativeQuery query=session.createNativeQuery(sql,Customer.class);
        List list=query.list();
    }


}

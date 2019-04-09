package com.ssh.server.daoImpl;

import com.ssh.server.dao.UserDao;
import com.ssh.server.model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao {
    @SuppressWarnings("unchecked")
    public void saveUser(User user) {
        getSession().save(user);
    }

    @Override
    public User queryUser(User user) {
        String hql ="from User where userName=? and password=?";
        Query query= getSession().createQuery(hql);
        query.setParameter(0,user.getUserName());
        query.setParameter(1,user.getPassword());

        User currentUser=null;
        List<User> userList=query.list();
        if(userList!=null&&userList.size()>0){
            currentUser=userList.get(0);
        }
        return currentUser;
    }

    @Override
    public User findUserById(Integer id) {
        String hql="from User where id=?";
        Query query=getSession().createQuery(hql);
        query.setParameter(0,id);
        User user= (User) query.uniqueResult();
        return user;
    }

    @Override
    public User findUserPassword(String userName, String email) {
        String hql ="from User where userName=? and email=?";
        Session session = getSession();
        Query query= session.createQuery(hql);
        query.setParameter(0,userName);
        query.setParameter(1,email);
        User currentUser = (User) query.uniqueResult();
        return currentUser;
    }

    @Override
    public List<User> findUser(List<Object> params, String hql) {
        Query query=getSession().createQuery(hql);
        if(params!=null && params.size()>0){
            for(int i=0;i<params.size();i++){
                query.setParameter(i,params.get(i));
            }
        }
        return query.list();
    }

    @Override
    public void uodateUser(User user) {
        getSession().save(user);
    }

    @Override
    public User findUserByUserName(String userName) {
        String hql="from User where userName=?";
        Session session=getSession();
        Query query=session.createQuery(hql);
        query.setParameter(0,userName);
        return (User) query.uniqueResult();
    }
}

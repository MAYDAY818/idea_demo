package com.ssh.server.dao;

import com.ssh.server.model.User;

import java.util.List;

public interface UserDao {
    public void saveUser(User user);
    public User queryUser(User user);
    public User findUserById(Integer id);
    public User findUserPassword(String userName,String email);
    public List<User> findUser(List<Object> params,String hql);
    public void uodateUser(User user);
    public User findUserByUserName(String userName);
}

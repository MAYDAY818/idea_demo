package com.mybatis.ui;

import com.mybatis.entity.User;
import com.mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    public static void main(String[] args){

        SqlSession sqlSession= MyBatisUtil.openSqlSession();
        List<User> users = sqlSession.selectList("com.mybatis.mapper.UserMapper.findAllUsers");
        for(User u : users) {
            System.out.println(u);
        }
        sqlSession.close();

    }
}

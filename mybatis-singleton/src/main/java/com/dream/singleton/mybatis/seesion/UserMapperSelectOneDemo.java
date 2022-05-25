package com.dream.singleton.mybatis.seesion;

import com.dream.singleton.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author <a href = "mailto:lmdreamfree@163.com">lim</a>
 * @date 2022/5/25 21:53
 * @className UserMapperDemo
 */
public class UserMapperSelectOneDemo {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("META-INF/mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("com.dream.singleton.mybatis.mapper.UserMapper.getUserById", 1);

        System.out.println(user);
    }
}

package com.dream.singleton.mybatis.seesion;

import com.dream.singleton.mybatis.domain.User;
import com.dream.singleton.mybatis.mapper.UserMapper;
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
public class UserMapperSelectDemo {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("META-INF/mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //org.apache.ibatis.session.defaults.DefaultSqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //org.apache.ibatis.binding.MapperProxy
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(userMapper.getUserById(1));
    }
}

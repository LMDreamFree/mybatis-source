package com.dream.singleton.mybatis.seesion;

import com.dream.singleton.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * <pre>
 * 一级缓存示例
 * </pre>
 *
 * @author <a href = "mailto:lmdreamfree@163.com">lim</a>
 * @date 2022/6/20 22:11
 * @className LocalCacheDemo
 */
public class LocalCacheDemo {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("META-INF/mybatis-config.xml");

        // 创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        SqlSession openSession = sqlSessionFactory.openSession(true);
        User user1 = openSession.selectOne("com.dream.singleton.mybatis.mapper.UserMapper.getUserById",1);
        System.out.println(user1);

        sqlSession.update("com.dream.singleton.mybatis.mapper.UserMapper.updateById","叫我墨罹丶007");

        User user = openSession.selectOne("com.dream.singleton.mybatis.mapper.UserMapper.getUserById",1);
        System.out.println(user);

    }
}

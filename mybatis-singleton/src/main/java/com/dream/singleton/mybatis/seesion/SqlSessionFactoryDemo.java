package com.dream.singleton.mybatis.seesion;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * <pre>
 * 启动mybatis 加载{@SqlSeesionFactoryu}
 * </pre>
 *
 * @author <a href = "mailto:lmdreamfree@163.com">lim</a>
 * @date 2022/5/25 21:43
 * @className SqlSessionFactoryDemo
 * @see SqlSessionFactory
 * @see SqlSessionFactoryBuilder
 */
public class SqlSessionFactoryDemo {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("META-INF/mybatis-config.xml");

        // 创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // org.apache.ibatis.session.defaults.DefaultSqlSession
        System.out.println(sqlSession.getClass().getName());
    }
}

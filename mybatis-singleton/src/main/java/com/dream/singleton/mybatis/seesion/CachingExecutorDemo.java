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
 * <pre>
 * 缓存装饰器
 * </pre>
 *
 * @author <a href = "mailto:lmdreamfree@163.com">lim</a>
 * @date 2022/6/11 13:11
 * @className CachingExecutorDemo
 */
public class CachingExecutorDemo {
    public static void main(String[] args) throws IOException {
        String location = "META-INF/mybatis-config.xml";
        InputStream stream = Resources.getResourceAsStream(location);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        SqlSession session = sqlSessionFactory.openSession();

        UserMapper mapper = session.getMapper(UserMapper.class);

        UserMapper sqlSessionMapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
//        二级缓存与事务相关  事务不提交  不会保存缓存 只会将数据保存在Map中
//        session.commit();


        System.out.println("第一次查询:" + user);
        User userById = sqlSessionMapper.getUserById(1);
        System.out.println("第二次查询,是否走了缓存:" + userById);

    }
}

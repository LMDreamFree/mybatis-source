package com.dream.singleton.mybatis.mapper;

import com.dream.singleton.mybatis.domain.User;

import java.io.Serializable;

/**
 * @author <a href = "mailto:lmdreamfree@163.com">lim</a>
 * @date 2022/5/25 21:50
 * @className UserMapper
 */
public interface UserMapper {

    User getUserById(Serializable id);
}

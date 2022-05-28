package com.dream.singleton.mybatis.type.handler;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * @author <a href = "mailto:lmdreamfree@163.com">lim</a>
 * @date 2022/5/28 12:52
 * @className ListTypeHandle
 */
public final class ListTypeHandle extends BaseTypeHandler<List<String>> {

    /**
     * Java类型到JDBC类型
     */
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, List<String> parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, StringUtils.join(parameter, ","));
    }

    /**
     * JDBC类型到Java类型
     */
    @Override
    public List<String> getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String source = rs.getString(columnName);
        return Arrays.asList(StringUtils.split(source, ","));
    }

    @Override
    public List<String> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String source = rs.getString(columnIndex);
        return Arrays.asList(StringUtils.split(source, ","));
    }

    @Override
    public List<String> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String source = cs.getString(columnIndex);
        return Arrays.asList(StringUtils.split(source, ","));
    }
}

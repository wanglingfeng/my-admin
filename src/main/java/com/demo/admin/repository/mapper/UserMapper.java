package com.demo.admin.repository.mapper;

import com.demo.admin.repository.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wanglingfeng
 * @date Created in 2021/12/1
 */
@Mapper
public interface UserMapper {

    List<User> query();

    User getById(@Param("id") Long id);

    boolean insert(User user);

    boolean update(User user);

    boolean delete(@Param("id") Long id);
}

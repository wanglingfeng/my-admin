package com.demo.admin.service;

import com.demo.admin.repository.domain.User;
import com.demo.admin.repository.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wanglingfeng
 * @date Created in 2021/12/1
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> query() {
        return userMapper.query();
    }

    public User getById(long id) {
        return userMapper.getById(id);
    }

    public boolean insert(User user) {
        return userMapper.insert(user);
    }

    public boolean update(User user) {
        return userMapper.update(user);
    }

    public boolean delete(long id) {
        return userMapper.delete(id);
    }
}

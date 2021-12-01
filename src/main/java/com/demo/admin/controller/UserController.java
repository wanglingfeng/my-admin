package com.demo.admin.controller;

import com.demo.admin.repository.domain.User;
import com.demo.admin.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wanglingfeng
 * @date Created in 2021/12/1
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping
    public List<User> query() {
        return userService.query();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable long id) {
        return userService.getById(id);
    }

    @PostMapping
    public boolean insert(@RequestBody User user) {
        return userService.insert(user);
    }

    @PutMapping("/{id}")
    public boolean update(@PathVariable long id, @RequestBody User user) {
        user.setId(id);
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable long id) {
        return userService.delete(id);
    }
}

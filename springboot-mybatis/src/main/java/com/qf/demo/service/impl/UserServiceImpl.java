package com.qf.demo.service.impl;

import com.qf.demo.entity.TUser;
import com.qf.demo.mapper.TUserMapper;
import com.qf.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private TUserMapper userMapper;
    @Override
    public TUser selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TUser> getUsers() {
        return userMapper.getUsers();
    }
}

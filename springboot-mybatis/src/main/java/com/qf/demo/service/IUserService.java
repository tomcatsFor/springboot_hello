package com.qf.demo.service;

import com.qf.demo.entity.TUser;

import java.util.List;

public interface IUserService {

    TUser selectByPrimaryKey(Integer id);

    List<TUser> getUsers();
}

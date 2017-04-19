package com.example.jdbc.service;

import com.example.jdbc.entity.User;

import java.util.List;

/**
 * Copyright (C) 1990 2013 南京擎天科技集团
 * IUserService.java
 * 创建人：李岸虹
 * 日期：2017-03-23 09:29
 * 描述：
 * 历史：
 */
public interface IUserService {

    List<User> getAllUser();

    User getUserById(String id);
}

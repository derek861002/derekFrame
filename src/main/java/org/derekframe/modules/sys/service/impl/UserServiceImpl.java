package org.derekframe.modules.sys.service.impl;

import org.derekframe.modules.sys.entity.User;
import org.derekframe.modules.sys.mapper.IUserMapper;
import org.derekframe.modules.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 * User shuaibo
 * Date 2016/5/3
 * Version: V1.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper iUserMapper;

    public int addUser(User user) {
        return iUserMapper.addUser(user);
    }
}

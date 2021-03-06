package com.autumnframework.cms.service.interfaces;


import com.autumnframework.cms.model.bo.DataPageResponseMsg;
import com.autumnframework.cms.model.bo.ResponseMsg;
import com.autumnframework.cms.model.po.User;

import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:09 2017/10/25.
 */
public interface IUserService {
    /**
     * 根据登录名查询用户
     * @param userLoginName
     * @return
     */
    User selectUserByloginName(String  userLoginName);

    /**
     * 获取所有的用户
     * @return
     */
    DataPageResponseMsg selectAllUser(int page, int limit);

    /**
     * 插入一条用户
     * @param user
     * @return
     */
    ResponseMsg insertUser(User user);
}

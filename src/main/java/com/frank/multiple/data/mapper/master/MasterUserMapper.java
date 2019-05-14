package com.frank.multiple.data.mapper.master;

import com.frank.multiple.data.pojo.User;

import java.util.List;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-multiple-data
 * @package: com.frank.multiple.data.mapper.master、
 * @email: cy880708@163.com
 * @date: 2019/5/14 下午3:34
 * @mofified By:
 */
public interface MasterUserMapper {

    int addUser(User user);

    int deleteUserById(Long id);

    int updateUserById(User user);

    User queryUserById(Long id);

    List<User> queryUserList();

}

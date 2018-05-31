package com.svr.service.impl;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.svr.bean.SysUser;
import com.svr.mapper.SysResourcesMapper;
import com.svr.mapper.SysUserMapper;
import com.svr.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserMapper userMapper;

    @Autowired
    private SysResourcesMapper sysResourcesMapper;

    @Override
    public SysUser getUser(SysUser user) {
        SysUser info = userMapper.selectOne(user);
        return info;
    }

    @Override
    public Set<String> findPermissionsByUserId(int userId) {
        Set<String> permissions = sysResourcesMapper.findRoleNameByUserId(userId);
        Set<String> result = new HashSet<>();
        for (String permission : permissions) {
            if (StringUtils.isBlank(permission)) {
                continue;
            }
            permission = StringUtils.trim(permission);
            result.addAll(Arrays.asList(permission.split("\\s*;\\s*")));
        }
        return result;
    }
}
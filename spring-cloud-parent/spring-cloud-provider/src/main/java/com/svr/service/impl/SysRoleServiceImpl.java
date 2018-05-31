package com.svr.service.impl;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.svr.mapper.SysRoleMapper;
import com.svr.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public Set<String> findRoleNameByUserId(int userId) {
        return sysRoleMapper.findRoleNameByUserId(userId);
    }
}

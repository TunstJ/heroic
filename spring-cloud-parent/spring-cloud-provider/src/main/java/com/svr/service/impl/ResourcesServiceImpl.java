package com.svr.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.svr.bean.SysResources;
import com.svr.mapper.SysResourcesMapper;
import com.svr.service.ResourcesService;

@Service
public class ResourcesServiceImpl implements ResourcesService {
    @Autowired
    private SysResourcesMapper sysResourcesMapper;

    @Override
    public List<SysResources> selectAll() {
        List<SysResources> resourcesList = sysResourcesMapper.selectAll();
        return resourcesList;
    }
}
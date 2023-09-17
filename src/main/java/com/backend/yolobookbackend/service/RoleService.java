package com.backend.yolobookbackend.service;

import com.backend.yolobookbackend.dao.RoleDao;
import com.backend.yolobookbackend.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }


}

package com.backend.yolobookbackend.dao;

import com.backend.yolobookbackend.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {



}

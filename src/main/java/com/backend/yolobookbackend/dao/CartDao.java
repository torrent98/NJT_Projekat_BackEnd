package com.backend.yolobookbackend.dao;

import com.backend.yolobookbackend.entity.Cart;
import com.backend.yolobookbackend.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartDao extends CrudRepository<Cart, Integer> {

    public List<Cart> findByUser(User user);

}

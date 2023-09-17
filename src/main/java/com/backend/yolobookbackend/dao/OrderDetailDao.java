package com.backend.yolobookbackend.dao;

import com.backend.yolobookbackend.entity.OrderDetail;
import com.backend.yolobookbackend.entity.User;
import jakarta.persistence.Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {

    public List<OrderDetail> findByUser(User user);

    public List<OrderDetail> findByOrderStatus(String status);


}

package com.oms.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oms.model.Order;
@Repository
public interface OrderRepository extends CrudRepository<Order,Serializable>{

}

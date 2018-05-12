package com.huanle.dao;

import java.util.List;

import com.huanle.model.Order;
import com.huanle.model.User;

public interface UserMapper {
	public User getUserById(int id);
	public List<Order> getUserOrders(int id);
}

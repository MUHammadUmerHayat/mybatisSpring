package com.huanle.dao;

import java.util.List;

import com.huanle.model.Order;
import com.huanle.model.User;
//这个接口描述了mybatis的xml文件里的sql语句中方法的参数和返回值的类型
public interface UserMapper {
	public User getUserById(int id);
	public List<Order> getUserOrders(int id);
}

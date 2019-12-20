package com.ust.retailermaintenancesystem.dao;

import java.util.List;

import com.ust.retailermaintenancesystem.dto.OrderProduct;
import com.ust.retailermaintenancesystem.dto.Product;
import com.ust.retailermaintenancesystem.dto.User;

public interface RetailerDAO {
	public User login(int id,String password);
	public int register(User bean);
	public Product searchProduct(String pname);
	public boolean updatePassword(int id, String password);

	public List<OrderProduct> getProducts(String email);
	public boolean buyProduct(OrderProduct orderProduct);
}

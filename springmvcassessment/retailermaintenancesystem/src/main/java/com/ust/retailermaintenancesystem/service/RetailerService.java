package com.ust.retailermaintenancesystem.service;

import java.util.List;

import com.ust.retailermaintenancesystem.dto.OrderProduct;
import com.ust.retailermaintenancesystem.dto.Product;
import com.ust.retailermaintenancesystem.dto.User;

public interface RetailerService {
	public User login(int id,String password);
	public int register(User bean);
	public Product searchProduct(String panme);
	public boolean updatePassword(int id, String password);

	public List<OrderProduct> getProducts(String email);
	public boolean buyProduct(User user,Product product,int quantity);
}

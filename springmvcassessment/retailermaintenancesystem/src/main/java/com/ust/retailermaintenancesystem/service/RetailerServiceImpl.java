package com.ust.retailermaintenancesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.retailermaintenancesystem.dao.RetailerDAO;
import com.ust.retailermaintenancesystem.dto.OrderProduct;
import com.ust.retailermaintenancesystem.dto.Product;
import com.ust.retailermaintenancesystem.dto.User;
@Service
public class RetailerServiceImpl implements RetailerService {
	@Autowired
	private RetailerDAO dao ;
	@Override
	public User login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public int register(User bean) {
		return dao.register(bean);
	}

	@Override
	public Product searchProduct(String pname) {
		return dao.searchProduct(pname);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		return dao.updatePassword(id, password);
	}



	@Override
	public List<OrderProduct> getProducts(String email) {
		return dao.getProducts(email);
	}

	@Override
	public boolean buyProduct(User user,Product product,int quantity) {
		OrderProduct orderProduct=new OrderProduct();
		orderProduct.setPrice(product.getPrice());
		orderProduct.setEmail(user.getEmail());
		int total=product.getPrice()*quantity;
		orderProduct.setTotal(total);
		orderProduct.setPname(product.getPname());
		orderProduct.setQuantity(quantity);	
		return dao.buyProduct(orderProduct);
	}
}

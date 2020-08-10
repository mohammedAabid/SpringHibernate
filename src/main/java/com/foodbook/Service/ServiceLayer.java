package com.foodbook.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.food.DTO.LoginDTO;
import com.foodbook.DAO.DAO;

@Component
public class ServiceLayer {
	@Autowired
	private DAO dao;
	
	public String LoginDetailsServiceLayer(LoginDTO employee ) throws Exception{
		dao.saveEmployee(employee);
		
		
		return "hello";
	}
	
	
	public ServiceLayer(){
		
		System.out.println("Service layer initilized ");
	}
}

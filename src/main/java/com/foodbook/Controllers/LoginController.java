package com.foodbook.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.food.DTO.LoginDTO;
import com.food.DTO.RegistrationDTO;
import com.foodbook.Service.ServiceLayer;

@Controller
public class LoginController {
	@Autowired
	private ServiceLayer service;

	@RequestMapping("/")
	public String homePage(@ModelAttribute("logindto") LoginDTO logindto) {
		System.out.println("hello Food Book APP!!!");
		return "Home-Page";
	}

	@RequestMapping("/LoginDetails")
	public String LoginDetails(@Valid @ModelAttribute("logindto") LoginDTO logindto, BindingResult result)
			throws Exception {
		System.out.println("Login Details captuerd !!!");
		System.out.println("Process  Page!!!" + result.hasErrors());
		if (result.hasErrors()) {
			System.out.println("errors has been identified in process page");
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError error : allErrors) {
				System.out.println(error);

			}
			return "Home-Page";

		}
		String h = service.LoginDetailsServiceLayer(logindto);
		return "Login-Page";
	}
	
	public LoginController() {
		
		System.out.println("LoginController initialized");
	}
}
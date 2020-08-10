package com.food.DTO;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;
@Entity
@Table(name ="ab")
@Component
public class LoginDTO implements Serializable {
    private static final long serialVersionUID = 1L;
 public LoginDTO() {
	 
	 System.out.println("LoginDTO Initilized ");
 }
	
	
	@Override
	public String toString() {
		return "LoginDTO [Login_Id=" + Login_Id + ", password=" + Arrays.toString(password) + "]";
	}
	@Min(value=3, message = "sholud be more than 3")
	@NotNull(message="Login Id sholud not be Null")
	@NotBlank(message="Login empty")
	@Id
	@Column(name = "Login_Id")
	private String Login_Id;
	@Column(name="password")
	private char[] password;
	public String getLogin_Id() {
		
		return Login_Id;
	}
	public void setLogin_Id(String login_Id) {
		System.out.println("login_Id"+login_Id);
		Login_Id = login_Id;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		System.out.println("password"+password);
		this.password = password;
	}

}

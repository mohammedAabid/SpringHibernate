package com.food.DTO;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.lang.NonNull;

public class RegistrationDTO {

	
	@NotBlank(message = "First Name sholud not be Blank")
	@NotEmpty(message = "First Name sholud not be Empty")
	@NotNull(message = "First Name sholud not be Null")
	private String first_Name;
	private String last_name;
	private char[] password;
	private String user_Id;
	private int mob_Number;
	private String email_Id;
	private String birthday;
	private String gender;
	private String[] hobbies;

	public String getFirst_Name() {
		System.out.println("fun caaled "+first_Name);
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		System.out.println("fun caaled1");
		this.first_Name = first_Name;
	}

	public String getLast_name() {
		System.out.println("fun caaled2");
		return last_name;
	}

	public void setLast_name(String last_name) {
		System.out.println("fun caaled 3");
		this.last_name = last_name;
	}

	public int getMob_Number() {
		return mob_Number;
	}

	public void setMob_Number(int mob_Number) {
		this.mob_Number = mob_Number;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

}

package com.in28minute;

public class PasswordValidation {
	
	public boolean IsValid(String Id,String Password) {
		if(Id.equals("Mujassam") && Password.equals("Patna@2022")) {
			return true;
		}
		return false;
	}

}

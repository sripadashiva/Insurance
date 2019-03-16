package com.vehicle.dao;

import java.util.HashMap;

import com.vehicle.beans.Registration;

public class RegistrationDAOImpl implements  RegistrationDAO{

	
	HashMap<String, Registration> mapRegister = new HashMap<String, Registration>();
	
	Registration registration=new Registration();
	
	
	public Registration RegistrationDAO(Registration registration) {
		// TODO Auto-generated method stub
		
		mapRegister.put(registration.getVehicleNo() , new Registration(registration.getVehicleType(),registration.getInsurancePeriod(),registration.getAadhaarCard(),registration.getMobileNumber()));

		System.out.println("enter");

		return registration;
	}
	
	
	public Registration getRegistrationDetails(int regdata) {
		
		mapRegister.containsKey(registration);
		
		return registration;
	}
	
	
}

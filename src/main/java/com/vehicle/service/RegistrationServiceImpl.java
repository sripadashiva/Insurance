package com.vehicle.service;

import com.vehicle.beans.Registration;
import com.vehicle.dao.RegistrationDAOImpl;
import com.vehicle.dao.*;
public class RegistrationServiceImpl implements RegistrationService {

	RegistrationDAO dao=new RegistrationDAOImpl();
	
	
	public Registration RegistrationDAO(Registration registration) {
		// TODO Auto-generated method stub
		return registration;
	}

	
	
}

package com.vehicle.mainUI;

import java.util.Scanner;

import com.vehicle.beans.Registration;
import com.vehicle.service.RegistrationService;
import com.vehicle.service.RegistrationServiceImpl;

public class Application {

	Scanner input=new Scanner(System.in);
	
	RegistrationService service=new RegistrationServiceImpl();
	Registration registration=new Registration();
	
	
	//method for registration details
	public void options() {
		
		System.out.println("Enter 1) Vehicle Insurance Registration \n2) Insurance Validity check\n3) Exit");
		
		int i =input.nextInt();
		
		
		switch (i) {
		
		case 1:{
			
			//calling method in service layer
			service.RegistrationDAO(vehicleDetails());
			
		}
		case 2:{
			
			
		}
		case 3:{
			
			break;
		}
		}
		
		
	}
	
	//method to take user inputs
	public Registration vehicleDetails() {
		
		System.out.println("enter  Vehicle no: ");
		registration.setVehicleNo(input.next());
		System.out.println("enter vehicle type:");
		registration.setVehicleType(input.next());
		System.out.println("enter insurance period(Years): ");
		registration.setInsurancePeriod(input.nextInt());
		System.out.println("enter aadhaar no: ");
		registration.setAadhaarCard(input.next());
		System.out.println("enter mobile no: ");
		registration.setMobileNumber(input.next());
		
		return registration;
		
	}
	
	public static void main(String args[]) {
		
		//object to call methods
		Application application=new Application();
		
		//method to start process
		application.options();
	}
}

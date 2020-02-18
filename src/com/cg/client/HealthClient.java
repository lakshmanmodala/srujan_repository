package com.cg.client;

import com.cg.exception.DiagnosticException;
import com.cg.exception.ValidateException;
import com.cg.service.HealthCareService;
import com.cg.service.HealthCareServiceImpl;

public class HealthClient {
	static HealthCareService ser = new HealthCareServiceImpl();

	public static void main(String[] args) {
       System.out.println("***List of all Diagnostic Centres***");
       ser.getCentres().values().forEach(System.out::println);
       System.out.println("---------------------------------------------");
       System.out.println("---------------------------------------------");
       try {
		if(ser.removeDiagnosticCentre("PNB"));
		      System.out.println("Removed Successfully");
		      System.out.println("***New DiagnosticCentres List***");
		ser.getCentres().values().forEach(System.out::println);
	} catch (DiagnosticException | ValidateException e) {
		System.err.println(e.getMessage());
	}
       
      
	}
}

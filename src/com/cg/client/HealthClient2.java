package com.cg.client;

import com.cg.entity.DiagnosticCentre;
import com.cg.exception.DiagnosticException;
import com.cg.exception.ValidateException;
import com.cg.service.HealthCareService;
import com.cg.service.HealthCareServiceImpl;

public class HealthClient2 {
	static HealthCareService ser = new HealthCareServiceImpl();
	public static void main(String[] args) {
		DiagnosticCentre centre = ser.getCentres().get("DEL");
		System.out.println("*** List of Tests***");
		centre.getListOfTests().forEach(System.out::println);
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		try {
			if(ser.removeDiagnosticTest("DEL", "MRI"))
				System.out.println("Removed Test Successfully");
			    System.out.println("***List of New Tests***");
		} catch (DiagnosticException | ValidateException e) {
			System.err.println(e.getMessage());
		}
		centre.getListOfTests().forEach(System.out::println);
	}

}

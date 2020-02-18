package com.cg.client;

import com.cg.dao.HealthCareDao;


import com.cg.dao.HealthCareDaoImpl;
import com.cg.entity.DiagnosticCentre;
import com.cg.exception.DiagnosticException;
import com.cg.service.HealthCareService;
import com.cg.service.HealthCareServiceImpl;
import com.cg.util.CgUtil;


class CentreUI {
	static HealthCareService ser = new HealthCareServiceImpl();
     
	public static void main(String[] args) {
		
	
        HealthCareDao dao = new  HealthCareDaoImpl();
        System.out.println("*** DiagnosticCentres List ***");
	    ser.getCentres().values().forEach(System.out::println);
		System.out.println("Enter the Centre Id");
		
		try {
			String centreId = CgUtil.scan.nextLine();
			
		    boolean res = dao.removeCentre(centreId);
			System.out.println("Centre Removed Successfully " + res);
		    System.out.println("*** New DiagnosticCentres List ***");
		ser.getCentres().values().forEach(System.out::println);
		} catch (DiagnosticException   ex ) {
			System.out.println(ex.getMessage());
			
		}
	}
		
		
		
	
	
}



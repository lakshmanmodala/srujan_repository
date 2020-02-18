package com.cg.service;

import java.util.Map;

import com.cg.entity.DiagnosticCentre;
import com.cg.entity.DiagnosticTest;
import com.cg.exception.DiagnosticException;
import com.cg.exception.ValidateException;

public interface HealthCareService {
		
	public boolean removeDiagnosticCentre(String centreId)throws DiagnosticException, ValidateException;
	public boolean removeDiagnosticTest(String centreId, String TestId)throws DiagnosticException, ValidateException;
	public Map<String, DiagnosticCentre> getCentres();
	   
}
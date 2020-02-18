package com.cg.dao;

import java.util.Map;

import com.cg.entity.DiagnosticCentre;
import com.cg.entity.DiagnosticTest;
import com.cg.entity.TestSlot;
import com.cg.exception.DiagnosticException;

public interface HealthCareDao {
	
	   public DiagnosticCentre viewDiagnosticCentre(String centreId) throws DiagnosticException;
	   public Map<String, DiagnosticCentre> getCentres();
	   public boolean removeCentre(String centreId)throws DiagnosticException;
	   public boolean removeTest(DiagnosticCentre centre, String testId)throws DiagnosticException;
	   
	}

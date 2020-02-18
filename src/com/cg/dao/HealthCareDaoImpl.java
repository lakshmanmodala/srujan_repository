package com.cg.dao;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;

import com.cg.entity.DiagnosticCentre;
import com.cg.entity.DiagnosticTest;
import com.cg.entity.TestSlot;
import com.cg.exception.DiagnosticException;
import com.cg.util.CgRepo;

public class HealthCareDaoImpl implements HealthCareDao {
	private Map<String, DiagnosticCentre> listofCenters = CgRepo.listOfCenters;
	
    @Override
	public Map<String, DiagnosticCentre> getCentres() {
		// TODO Auto-generated method stub
		return listofCenters;
	}




	@Override
	public DiagnosticCentre viewDiagnosticCentre(String centreId) throws DiagnosticException {
		if (!listofCenters.containsKey(centreId))
			throw new DiagnosticException("No centre found");
		return listofCenters.get(centreId);
	}




	@Override
	public boolean removeCentre(String centreId) throws DiagnosticException {
		if(!listofCenters.containsKey(centreId))
			throw new DiagnosticException("Centre Not Found");
		listofCenters.remove(centreId);
		return true;
	}




	@Override
	public boolean removeTest(DiagnosticCentre centre,String testId) throws DiagnosticException {
		List<DiagnosticTest> testList =
				centre.getListOfTests().stream().filter(test->test.getTestId().equalsIgnoreCase(testId)).collect(Collectors.toList());
		if(testList.isEmpty())
			throw new DiagnosticException("No Test Found");
		centre.getListOfTests().remove(testList.get(0));
	    return true;
	}

}

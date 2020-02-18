package com.cg.service;

import java.util.List;

import java.util.Map;

import com.cg.dao.HealthCareDao;
import com.cg.dao.HealthCareDaoImpl;
import com.cg.entity.DiagnosticCentre;
import com.cg.exception.DiagnosticException;
import com.cg.exception.ValidateException;

public class HealthCareServiceImpl  implements HealthCareService {

	private HealthCareDao dao = new HealthCareDaoImpl();

		@Override
	public Map<String, DiagnosticCentre> getCentres() {
		
		return dao.getCentres();
	}

		//
		@Override
		public boolean removeDiagnosticCentre(String centreId) throws ValidateException, DiagnosticException {
			if(validateCentreId(centreId))
				dao.removeCentre(centreId);
			return true;
		}
		
		public boolean validateCentreId(String centreId) throws ValidateException {
			if(!centreId.matches("[a-zA-Z]{3}"))
					throw new ValidateException("Invalid Centre ID");
			return true;
		}

		@Override
		public boolean removeDiagnosticTest(String centreId, String testId) throws ValidateException, DiagnosticException {
			if(validateCentreId(centreId)) {
				DiagnosticCentre centre = dao.viewDiagnosticCentre(centreId);
				dao.removeTest(centre, testId);
				return true;
			}
				
			return false;
		}

}

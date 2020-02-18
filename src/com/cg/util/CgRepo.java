package com.cg.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.entity.DiagnosticCentre;
import com.cg.entity.DiagnosticTest;
import com.cg.entity.TestSlot;

public class CgRepo {
	public static Map<String,DiagnosticCentre> listOfCenters = new HashMap<>();

	static {
		DiagnosticCentre centre = new DiagnosticCentre("PNB", "LPU Diagnostics");
		DiagnosticTest test1 = new DiagnosticTest("MRI","MRI SCAN" ,1200);
		DiagnosticTest test2 = new DiagnosticTest("CG", "CG SCAN",4200);
		DiagnosticTest test5 = new DiagnosticTest("LFT", "Liver functioning Test",2000);
		DiagnosticTest test6 = new DiagnosticTest("CBC", "Complete Blood Circulation Test",4000);

	    TestSlot slot1 = new TestSlot("1", LocalDate.of(2020, 02,20), 10);
		TestSlot slot2 = new TestSlot("2", LocalDate.of(2020, 02,21), 10);
		TestSlot slot5 = new TestSlot("3", LocalDate.of(2020, 02,22), 10);
        TestSlot slot6 = new TestSlot("4", LocalDate.of(2020, 02,23), 10);
        
        List<TestSlot> slots1 = new ArrayList<>();
	    slots1.add(slot1);
		slots1.add(slot2);
		slots1.add(slot5);
		slots1.add(slot6);
		test1.setTestSlotList(slots1);
		
        List<DiagnosticTest> tests= new  ArrayList<>();
		tests.add(test1);
		tests.add(test2);
		tests.add(test5);
		tests.add(test6);
		centre.setListOfTests(tests);
		
        
		//for test2
		TestSlot slot3 = new TestSlot("1", LocalDate.of(2020, 02,20), 10);
		TestSlot slot4= new TestSlot("2", LocalDate.of(2020, 02,21), 10);
		List<TestSlot> slots2 = new ArrayList<>();
		slots2.add(slot1);
		slots2.add(slot2);
		slots2.add(slot5);
		test2.setTestSlotList(slots1);
		
	   //for centre2
		DiagnosticCentre centre2 = new DiagnosticCentre("DEL", "DEL Diagnostics");
				
		tests= new  ArrayList<>();
		tests.add(test1);
		tests.add(test2);
		
		centre2.setListOfTests(tests);
		
		slots1 = new ArrayList<>();
		slots1.add(slot1);
		slots1.add(slot2);
		test1.setTestSlotList(slots1);
		
		
		slots2 = new ArrayList<>();
		slots2.add(slot1);
		slots2.add(slot2);
		test2.setTestSlotList(slots1);
		
		listOfCenters.put(centre.getCenterId(), centre);
		listOfCenters.put(centre2.getCenterId(), centre2);
	}
	
	}


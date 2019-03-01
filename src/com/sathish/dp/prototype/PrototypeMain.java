package com.sathish.dp.prototype;

/**
 * 
 * @author Sathish
 *
 */
public class PrototypeMain {

	public static void main(String[] args) {

		int eid = 12345;
		String ename = "Sathish";
		System.out.print("\n");
		String edesignation = "Technology Lead";

		EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation);

		e1.showRecord();
		System.out.println("\n");
		EmployeeRecord e2 = (EmployeeRecord) e1.getClone(); // cloning
		e2.showRecord();
	}
}

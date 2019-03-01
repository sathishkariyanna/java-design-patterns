package com.sathish.dp.prototype;

/**
 * 
 * @author Sathish
 *
 */
class EmployeeRecord implements Prototype {

	private int id;
	private String name, designation;

	public EmployeeRecord() {
		System.out.println("   Employee Records of XYZ Corporation ");
		System.out.println("---------------------------------------------");
		System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation");

	}

	public EmployeeRecord(int id, String name, String designation) {

		this();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	public void showRecord() {

		System.out.println(id + "\t" + name + "\t" + designation);
	}

	@Override
	public Prototype getClone() {

		return new EmployeeRecord(id, name, designation);
	}
}

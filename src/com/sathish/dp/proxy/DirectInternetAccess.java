package com.sathish.dp.proxy;

/**
 * 
 * @author Sathish
 *
 */
public class DirectInternetAccess implements OfficeInternetAccess {
	private String employeeName;

	public DirectInternetAccess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public void grantInternetAccess() {
		System.out.println("Internet Access granted for employee: " + employeeName);
	}
}

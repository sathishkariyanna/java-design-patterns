package com.sathish.dp.proxy;

/**
 * 
 * @author Sathish
 *
 */
public class ProxyInternetAccess implements OfficeInternetAccess {
	private String employeeName;
	private DirectInternetAccess directAccess;

	public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {
		if (getRole(employeeName) > 4) {
			directAccess = new DirectInternetAccess(employeeName);
			directAccess.grantInternetAccess();
		} else {
			System.out.println("No Internet access granted. Your job level is below 5");
		}
	}

	public int getRole(String emplName) {
		// Check role from the database based on Name/id
		return 9;
	}
}

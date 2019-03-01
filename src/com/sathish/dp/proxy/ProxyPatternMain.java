package com.sathish.dp.proxy;

/**
 * 
 * @author Sathish
 *
 */
public class ProxyPatternMain {
	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("Sathish");
		access.grantInternetAccess();
	}
}

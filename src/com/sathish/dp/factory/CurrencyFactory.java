package com.sathish.dp.factory;

/**
 * 
 * @author Sathish
 *
 */
class India implements Currency {

	@Override
	public String getCurrency() {

		return "Rupee";
	}

	@Override
	public String getSymbol() {

		return "Rs";
	}

}

class USA implements Currency {

	@Override
	public String getCurrency() {

		return "Dollar";
	}

	@Override
	public String getSymbol() {

		return "$";
	}
}

public class CurrencyFactory {

	public static Currency getCurrencyByCountry(String cnty) throws Exception {

		if ("IN".equalsIgnoreCase(cnty)) {
			return new India();
		} else if ("USA".equalsIgnoreCase(cnty)) {
			return new USA();
		}
		throw new Exception("Invalid country...");
	}

	public static void main(String a[]) {
		Currency currency;
		try {
			currency = CurrencyFactory.getCurrencyByCountry("USA");
			System.out.println("USA currency: " + currency.getCurrency());
			System.out.println("USA currency symbol: " + currency.getSymbol());

			currency = CurrencyFactory.getCurrencyByCountry("IN");
			System.out.println("Indian currency: " + currency.getCurrency());
			System.out.println("Indian currency symbol: " + currency.getSymbol());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

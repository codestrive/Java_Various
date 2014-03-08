package codestrive.factoryDesignPattern.demo;

public class FixedAccount implements Account {
	/*
	 * Fixed account
	 */
	@Override
	public String getInterestRate() {
		System.out.println("In fixed account class: getInterestRate");
		String message = "Fixed Account: 9% interset per annum";
		return message;
	}

}

package codestrive.factoryDesignPattern.demo;

public class PPFAccount implements Account {

	/*
	 * PPF account
	 */
	@Override
	public String getInterestRate() {
		System.out.println("In ppf account class: getInterestRate");
		String message = "PPF Account: 7.5% interset per annum";
		return message;
	}

}

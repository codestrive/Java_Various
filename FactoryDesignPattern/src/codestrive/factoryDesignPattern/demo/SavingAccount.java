package codestrive.factoryDesignPattern.demo;

public class SavingAccount implements Account {
	/*
	 * Saving account
	 */
	
	@Override
	public String getInterestRate() {
		System.out.println("In saving account class: getInterestRate");
		String message = "Saving Account: 4% interset per annum";
		return message;
	}

}

package codestrive.factoryDesignPattern.demo;

public class AccountFactory {

	public String getRate(String accountType){
		/*
		 * Account Factory class: It will initiate the require subclass as
		 * per user input from the Client class
		 * 
		 * In future if some new account type is introduced we just have 
		 * to create a subclass and put the logic to define the class here
		 * Client and Main Business logic need not to change anything.
		 * This is the beauty of Factory Pattern.
		 */
		System.out.println("Account Factory Called");
		Account userAccount = null;
		
		if("S".equalsIgnoreCase(accountType))
			userAccount = new SavingAccount();
		if("F".equalsIgnoreCase(accountType))
			userAccount = new FixedAccount();
		if("P".equalsIgnoreCase(accountType))
			userAccount = new PPFAccount();
		
		String interestrate  = userAccount.getInterestRate();
		return interestrate;
	}
}

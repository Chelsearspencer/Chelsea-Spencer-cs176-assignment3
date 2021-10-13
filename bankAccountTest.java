package bankAccount;

public class bankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
bankAccountClass harryChecking = new bankAccountClass("harry", 12345, 0.0, false);
		
		harryChecking.string();
		System.out.println();
		harryChecking.deposit(200);
		System.out.println("balance after depositing 200 :"+harryChecking.getBalance());
		harryChecking.withdraw(500);
		System.out.println("balance after withdrawing 500 :"+harryChecking.getBalance());
		harryChecking.deposit(400);
		System.out.println("balance after depositing 400 :"+harryChecking.getBalance());
		System.out.println();
		
		
bankAccountClass harrySavings = new bankAccountClass("Harry", 86754, 500.00, false );

		harrySavings.string();
		System.out.println();
		harrySavings.transfer(50,harryChecking);
		System.out.println("balance after transfering 50 :"+harrySavings.getBalance());
		harrySavings.interest();
		System.out.println("balance with interest 3.5% :"+harrySavings.getBalance());
		
	
	
	}

}

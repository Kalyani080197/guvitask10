package task10;

public class DepositandWithdrawBal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Create an Account object using the no-argument constructor
        Account account1 = new Account();
        
        // Display the initial balance of account1
        System.out.println("Initial balance of account1: $" + account1.getBalance());
        
        // Deposit $500 into account1
        account1.deposit(500);
        
        // Withdraw $200 from account1
        account1.withdraw(200);
        
        // Create an Account object using the parameterized constructor
        Account account2 = new Account(1000);
        
        // Display the initial balance of account2
        System.out.println("Initial balance of account2: $" + account2.getBalance());
        
        // Withdraw $1200 from account2 (attempting to withdraw more than the balance)
        account2.withdraw(1200);

	}

}

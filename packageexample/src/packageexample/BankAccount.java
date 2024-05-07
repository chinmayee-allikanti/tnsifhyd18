package packageexample;

public class BankAccount {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		SavingsAccount s1=new SavingsAccount();
		SalaryAccount s2=new SalaryAccount();
		CurrentAccount c1=new CurrentAccount();
		s1.accountholder("Chinmayee");
		s1.deposit(10000);
		s1.withdrawal(2000);
		s2.accountholder("v");
		s2.deposit(20000);
		s2.withdrawal(4000);
		c1.accountholder("j");
		c1.deposit(40000);
		c1.withdrawal(2000);		

	}

}

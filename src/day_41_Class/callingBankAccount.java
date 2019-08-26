package day_41_Class;

public class callingBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount n=new BankAccount();
n.accountHolder="Tsolmon";
n.accountNumber=889776655;
n.deposit(200);
System.out.println("Balance: "+n.balance);
n.withdraw(300);
n.showBalance();
n.charge(20, "bread");
n.showBalance();
	}

}

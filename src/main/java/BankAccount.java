import java.util.Scanner;
public class BankAccount {
	static Scanner input = new Scanner(System.in);
		private String owner ;
		private int balance ;
		private int minimum ;
		int dep;
		
		public BankAccount(String user, int bal, int min){
			this.balance = bal;
			this.minimum = min;
			this.owner = user;
		}
		
		public String getOwner() {
			return this.owner;
		}
		
		public int getBalance() {
			return this.balance;
		}
		
		public int getMin() {
			return this.minimum;
		}
		
		public void setBalance(int newBal) {
			if (newBal > minimum)
				this.balance = newBal;
			else
				System.out.println("ERROR, your balance is under minimum");
		}
		
		public void setOwner(String owner) {
			this.owner = owner;
		}
		
		public void deposit(int dep) {
			this.balance += dep;
		}
		
		public boolean withdraw(int amount) {
			if (this.balance - amount < minimum)
				return false;
			this.balance -= amount;
				return true;
		}
		
		public boolean transfer(BankAccount trans, int transAmount) {
			if (withdraw(transAmount) == false) {
				return false;
			}
			trans.deposit(transAmount);
			return true;
		}
		
		 public String toString() {
		        return "balance of " + this.owner + " is: " + balance;
		    }
}
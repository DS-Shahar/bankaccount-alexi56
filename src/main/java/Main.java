public class Main {
	public static void main(String[] args) {
		
		BankAccount lisa = new BankAccount("Lisa", 1000, -1000);
        BankAccount bob = new BankAccount("Bob", 1000, -1000);

        System.out.println(lisa);
        System.out.println(bob);
        
        lisa.transfer(bob, 500);
        
        System.out.println(lisa);
        System.out.println(bob);
        
        boolean transfer= lisa.transfer(bob, 1600);
        
        if(transfer==false) {
        	System.out.println("Not enough money in account");
        }
	}
}
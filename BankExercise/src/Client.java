import java.util.ArrayList;

public class Client {
	
	private int accnumber;
	private String name;
	private int initialbalance;
	private int balance;
	ArrayList<Integer>whistory= new ArrayList();
	ArrayList<Integer>dhistory= new ArrayList();
	
	public Client(String name, int accnumber, int initialbalance) {
		this.accnumber = accnumber;
		this.name = name;
		this.initialbalance = initialbalance;
	}
	public int getAccnumber() {
		return accnumber;
	}
	public String getName() {
		return name;
	}
	public int getInitialbalance() {
		return initialbalance;
	}
	public int getBalance() {
		return balance;
	}
	
	
	
	
	// methods//
	
	protected void withdraw(int value) {
		if (value > this.balance) {
			System.out.println("Sorry. Enter a smaller amount.");
		}
		else {
			this.balance = this.balance - value;
			whistory.add(value);
		}
	}
	
	//DEPOSIT//
	protected void deposit(int value) {
		if ((this.balance+value) > 2000000000) {
			System.out.println("Sorry.Enter a smaller amount.");
		}
		else {
			this.balance = this.balance + value;
			dhistory.add(value);
		}
	}
	
	//BANK EXTRACT//
	protected void extract() {
		System.out.println("Name :"+this.name);
		System.out.println("Account Number :"+this.accnumber);
		//withdraw history//
		System.out.println("--Withdraws--");
		for (int i = 0; i < whistory.size(); i++) {
			System.out.println("-"+whistory.get(i));
			
		}
		//deposit history//
		System.out.println("--Deposits--");
		System.out.println("+"+this.initialbalance);
		for (int i = 0; i < dhistory.size(); i++) {
			System.out.println("+"+dhistory.get(i));
			
		}
		//balance//
		System.out.println("Your balance is "+java.text.NumberFormat.getCurrencyInstance().format(this.balance));
		
	}
	//Balance//
	protected void addInitialAmount(int initialamount) {
		this.balance = this.balance + initialamount;
		
		
	}

	
}

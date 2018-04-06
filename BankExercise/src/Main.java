import java.util.Scanner;

public class Main {
public static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		//Menu//
		
		System.out.println("Enter your full name.");
		String name = read.nextLine();
		System.out.println("Enter an initial amount.");
		int initialbalance = read.nextInt();
		System.out.println("Generating your Account Number, please wait.");
		int accnumber = (int)(Math.random()*1000001);
		System.out.println("Your Account Number is: "+accnumber);
		//creating client//
		Client client = new Client(name,accnumber,initialbalance);
		client.addInitialAmount(initialbalance);
		//Menu OPTIONS//
		int option;
		
		do {
			showMenuOptions();
			option = read.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter the deposit amount");
				int value = read.nextInt();
				client.deposit(value);
				break;
			case 2:
				System.out.println("Enter the withdraw amount");
				value = read.nextInt();
				client.withdraw(value);
				break;
			case 3:
				client.extract();
				break;
			case 4:
				System.out.println("See You Next Time!");
				break;
				
				default :
					System.out.println("Enter a valid option");
					break;
			
			
			}
			
			
		}while(option !=4);
		
		

	}
	
	//showmenu//
	public static void showMenuOptions() {
		System.out.println("1 - Deposit");
		System.out.println("2 - Withdraw");
		System.out.println("3 - Your Extract");
		System.out.println("4 - Exit");
		
	}
	

}

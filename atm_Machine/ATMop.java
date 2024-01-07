package atm_Machine;

import java.util.HashMap;
import java.util.Scanner;

public class ATMop{
	Scanner sc=new Scanner(System.in);

	HashMap<Integer,Data> map=new HashMap<>();
	ATMop(){
		System.out.println("Welcome to our Atm");
		op();
	}
	
	public void op() {
		System.out.println("Enter the Atm pin to Continue");
		int pincode=sc.nextInt();
		if(map.containsKey(pincode)==true) {
			Data obj=map.get(pincode);
			menu(obj);
		}else {
			System.out.println("************************************************");
			System.out.println("Account Doesnot Exist with this pin Please set up the Pin");
			System.out.println("Enter the pin to setup your Account");
			int pin=sc.nextInt();
			System.out.println("Enter the pin again to Confirm");
			int cnfpin=sc.nextInt();
			if(pin==cnfpin) {
				System.out.println("Account Created Successfully");
				Data obj=new Data();
				map.put(pin,obj);
				System.out.println("************************************************");
				menu(obj);
			}else {
				System.out.println("Passwords Donot Match Try Again.....");
				System.out.println("************************************************");
				op();
			}
			
			
			
			
		}
		
	}
	public void menu(Data obj) {
		System.out.println("************************************************");
		System.out.println("Enter valid Number to Choose Below Options");
		System.out.println("1.CheckBalance");
		System.out.println("2.Deposit Money");
		System.out.println("3.Withdraw Money");
		System.out.println("4.Check Another Account");
		System.out.println("5.Exit");
		System.out.println("************************************************");
		
		int x=sc.nextInt();
		if(x==1) {
			check_balance(obj);
		}else if(x==2) {
			deposit_money(obj);
		}else if(x==3) {
			withdrwaw_money(obj);
		}else if(x==4) {
			op();
		}else if(x==5) {
			System.out.println("************************************************");
			System.out.println("Thank you....!");
			System.out.println("************************************************");
		}else {
			System.out.println("please enter valid Number");
			menu(obj);
			
		}
		
	}
	
	public void check_balance(Data obj) {
		System.out.println("************************************************");
		System.out.println("Your balance is: "+obj.balance);
		System.out.println("************************************************");
		menu(obj);
		
	}
	public void deposit_money(Data obj) {
		System.out.println("************************************************");
		System.out.println("Enter the amount to be Deposited in your Account");
		int amount=sc.nextInt();
		obj.balance +=amount;
		System.out.println("Amount"+amount+"credited Successfully and your available balance is "+obj.balance);
		System.out.println("************************************************");
		menu(obj);
	}
	public void withdrwaw_money(Data obj) {
		System.out.println("************************************************");
		System.out.println("Enter the amount to be Debited from your Account");
		int amount=sc.nextInt();
		
		if(obj.balance>=amount) {
			obj.balance -=amount;
			System.out.println("Amount"+amount+"Debited Successfully and your available balance is "+obj.balance);
		}else {
			System.out.println("Insufficient Balance to Withdraw the money please try again later");
		}
		System.out.println("************************************************");
		
		menu(obj);
	}
}

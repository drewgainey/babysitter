package babysitter;

import java.util.Scanner;

public class BabysitterApp {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner input = new Scanner(System.in); //unsure about the warning 
		
		
		System.out.println("Welcome to Baby Sitter Calculator");
		System.out.println("Please use 24 hour time");
		Thread.sleep(2000);
		System.out.println("What time does your job start?");
		double startTime = input.nextDouble();
		
		Thread.sleep(2000);
		System.out.println("What time is the kids bed time?");
		double bedTime = input.nextDouble();
		
		Thread.sleep(2000);
		System.out.println("What time will you leave?");
		double endTime = input.nextDouble();
		
		Appointment newAppointment = new Appointment(startTime, bedTime, endTime);
		
		Thread.sleep(2000);
		System.out.println("Your pay will be....");
		Thread.sleep(2000);
		System.out.println(newAppointment.calculatePay()); 
		

	}

}

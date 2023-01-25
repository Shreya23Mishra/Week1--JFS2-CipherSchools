import java.util.Scanner;

/* Assuming you are riding a bike and Police Officer stops you
   * Police officer asking you  to provide 2 details 
   * 1. Your current speed
   * 2.If it is your birthday today
   * The police officer will calculate ticket based on the following parameters:
   * > if it your birthday you will be waived off(exempted) with 5 miles/hour
   * > if it is not your birthday no exemption will be given
   * if your speed is greater than 80 ticket raised will be 'High Ticket'
   * if your speed is between 60 and 80 ticket raised will be 'Mid  Ticket'
   * if your speed is below 60 ticket raised will be 'No Ticket'
   * Find the ticket
   */

public class BikePolice {
    public static void main (String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Speed :");
    	int speed = sc.nextInt();
    	
    	System.out.println("Today is Your Birthday ?");
    	boolean isbirthday = sc.nextBoolean();
    	
    	if(isbirthday==true) {
    		speed=-5;
    	}
    	
    	if(speed>80)
    	System.out.printf("High ticket");
        else if(speed>=60) 
    	System.out.printf("Mid ticket");
        else
        System.out.println("No ticket");
    }
}

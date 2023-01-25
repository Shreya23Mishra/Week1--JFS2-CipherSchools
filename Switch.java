import java.util.Scanner;

public class Switch {

	
	public static void main(String[] args) {
		
		//Get user Division and print his/her Rank
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your division:");
		
		int div = sc.nextInt();
		
		switch(div) {
		case 1:
			System.out.println("First Rank");
			break;
			
		case 2:
			System.out.println("Second Rank");
			break;
			
		case 3:
			System.out.println("Third Rank");
			break;
		default:
			System.out.println("No Rank");

		}
	}
}

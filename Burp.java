import java.util.Scanner;
public class Burp {
      public static void main(String[] args) {
    	  
    	  Scanner sc = new Scanner (System.in);
  		
  		  System.out.println("How long is your Burp ?");
  		  
  		  int burpLength = sc.nextInt();
  		  
  		  String msg="";
  		  for(int i =1; i<= burpLength ; i++) {
  			  msg= msg+'r';  //or msg+="r"
  		  }
  		  System.out.println("Bu"+msg+"p");
      }
}
/* if BurpLength is 4
r= ''+ r
rr = r + r
rrr = rr + r
rrrr = rrr + r
*/
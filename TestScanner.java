import java.util.Scanner;
public class TestScanner{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the BasicPay:");
            
            double basicpay = sc.nextInt();
            double hra = 0; 
            double da =0;
            
            if(basicpay >=5000){
             hra = 0.1*basicpay;
             da = 0.2*basicpay;
                
            }
            else{
                hra = 0.2*basicpay;
                da = 0.3*basicpay;
            }
            System.out.println("HRA="+(hra)+ "  " +"DA="+(da));
            System.out.println("Gross pay is:"+(basicpay+hra+da));
    }
}
}

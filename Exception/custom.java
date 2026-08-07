import java.util.Scanner;
class InsufficientBalanceException extends RuntimeException{

}

public class custom {
    public static void main(String [] args){
       int amt=2000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw:");
        int withdraw = sc.nextInt();
        if (withdraw<amt){
            System.out.println("Withdraw successful");
        }
        else{
            try{
                InsufficientBalanceException obj = new InsufficientBalanceException();
                throw obj;
            

            }
        
        catch(InsufficientBalanceException e){
            System.out.println("Insufficient Balance");
        }

    }
 
    
}
}
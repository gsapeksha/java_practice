import java.util.Scanner;
public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int num = sc.nextInt();
        if(num<=1){
            System.out.println("is not prime");
            sc.close();
            return;
        }
        boolean isPrime=true;
        
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
            
        }
            if(isPrime){
                System.out.println("is prime");
            }
            else{
                System.out.print("is not prime");
            }
            sc.close();
    }
}

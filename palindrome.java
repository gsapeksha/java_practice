import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse=0;
        while(num!=0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
            }
        if (original == reverse){
            System.out.println(original + "is palindrome ");
        }
        else{
            System.out.println(original + " is not a palindrome");
        }


    }
}

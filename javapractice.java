import java.util.Scanner;
public class javapractice{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1=sc.nextInt();
        System.out.println("enter number 2:");
        int num2=sc.nextInt();
        if(num1 > num2){
            System.out.println("largest "+ num1);
        }
        else if(num1 < num2){
            System.out.println("largest "+num2);
        }
        else{
            System.out.println("both are equal");
        }
    }
}
/* 
PRINT NUMBERS FROM 1 TO N:


import java.util.Scanner;
public class print1toN {
    public static void main(String[] args){
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1 ; i<=n ;i++){
            System.out.println(i);
        }
    }
}
*/

/*
import java.util.Scanner;
public class print1toN{
    public static void main(String[] args){
        System.out.println("enter a number");
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1 ; i<=n ;i++){
            sum = sum +i;
        }
        System.out.println("sum : " + sum);
    }
}

*/

/*
import java.util.Scanner;
public class print1toN{
    public static void main(String[] args){
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1 ; i<=10 ;i++){
            int result=n*i;
        System.out.println(n + " x "+i +" = "+result);
        }
        
    }
}

*/

import java.util.Scanner;
public class print1toN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
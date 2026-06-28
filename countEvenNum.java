
/*
public class countEvenNum {
    public static void main(String[] args){
        int arr[]={4,5,24,7,5,9,30};
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count=count+1;
            }
            
        }
        System.out.println(count);
    }
}
*/

import java.util.Scanner;
public class countEvenNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        int count_even=0;
        int count_odd=0;
        for (int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                count_even=count_even+1;
                
            }else{
                count_odd=count_odd+1;
                
            }
        }
        System.out.println("number of even numbers: "+count_even);
        System.out.println("number of odd numbers: "+count_odd);


    }
}
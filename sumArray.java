/*
class sumArray{
    public static void main (String[] args){
        int arr[] = {2,3,4,5};
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
*/

import java.util.Scanner;
    public class sumArray{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter size of array: ");
            int n = sc.nextInt();
            int arr[]=new int[n];
            int sum = 0;
            System.out.print("enter element of array: ");
            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                sum = sum+arr[i];
            }
            System.out.println("sum of array is : "+sum);

        }

    }


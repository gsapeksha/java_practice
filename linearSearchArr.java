
/*
import java.util.Scanner;

public class linearSearchArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.print("enter array elements: ");
        for (int i=0;i<arr.length;i++){
            
            arr[i]=sc.nextInt();
            
        }
        boolean found = false;
        System.out.print("element to search: ");
        int num = sc.nextInt();
        for (int j=0;j<arr.length;j++){
            if (num==arr[j]){
                found=true;
                break;
            }
            
        }
            if (found){
                System.out.println("found");
            }else{
                System.out.println("not found");
            }
        


    }
}
*/

import java.util.Scanner;
public class linearSearchArr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size: ");
        int n = sc.nextInt();
        int arr[]=new int [n];
        System.out.print("enter elements of array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int j=0;j<arr.length;j++){
            
        }

    }
}
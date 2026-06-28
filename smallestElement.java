/*
public class smallestElement {
    public static void main(String[] args){
        int arr[]={94, 584, 64, 30};
        int smallest = arr[0];
        for (int i=0;i<arr.length;i++){
            if( smallest > arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);

    }
}
*/

import java.util.Scanner;
public class smallestElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        int smallest = arr[0];    // int smallest =0 - anteeeee if we give arr in negative number -9 -8 -7 then it cant take it as they r less than 0...
        for (int j=0;j<arr.length;j++){
            if(smallest>arr[j]){
                smallest=arr[j];
            }

        }
        System.out.println("smallest element: "+smallest);

    }
}
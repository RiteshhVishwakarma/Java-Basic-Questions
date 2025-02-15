// WAP to find the sum of all elements in a given 1D array. Ask number of elements to user.

import java.util.Scanner;
public class Array_Element_Sum_43 {
    public static void main(String[] args){
        int sum =0 ;
        int[] arr= new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        for (int i =0; i<=2; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Stored Number Is: ");
        for (int i =0; i<=2; i++){
            sum = arr[i]+sum;
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Sum of All element is: "+sum);
    }
}

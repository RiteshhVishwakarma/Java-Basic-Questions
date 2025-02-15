// WAP to input an 1D array and print it in reverse order, without using in-built function
import java.util.Scanner;
public class array_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput, i;
        int[] arr = new int[4];

        System.out.println("Enter 4 (Four) Number: ");
        for (i=0; i<=3; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Reverse: ");
        for(i=0;i<=3; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("");
//        Reverse Logic

        System.out.println("After Reverse");
        for (i=3; i>=0; i--){  // 10,20,30,40
            System.out.print(arr[i]+" ");
        }
    }
}

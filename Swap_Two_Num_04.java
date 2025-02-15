// Write a program to swap two given numbers. Make use of temporary variable.
import java.util.Scanner;
public class Swap_Two_Num_04 {
    public static void main(String[] args) {
        int num1, num2, temp;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        num1 = sc.nextInt();

        System.out.print("Enter Num2: ");
        num2 = sc.nextInt();

        System.out.println("Before swapping: ");
        System.out.println(num1 +" "+num2);
        System.out.println("____________________");

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: ");
        System.out.println(num1 +" "+num2);

    }
}

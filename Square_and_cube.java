// 6. Write a program to find square and cube of given number.
import java.util.Scanner;
public class Square_and_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number for square and cube: ");
        num = sc.nextInt();

        System.out.println("Square is: "+num*num);
        System.out.println("Cube is: "+num*num*num);
    }
}

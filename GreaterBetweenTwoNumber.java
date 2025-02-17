//WAP to find greater between two numbers.

import java.util.Scanner;

public class GreaterBetweenTwoNumber {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 And 2: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1<num2){
            System.out.println(num1+" is Smaller");
        }else {
            System.out.println(num1+" is Greater");

        }
    }
}

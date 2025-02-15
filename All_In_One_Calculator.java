import java.util.Scanner;

public class All_In_One_Calculator {
    public static void main(String[] args) {
        float num1, num2, add, sub, multiply, divide;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        num1 = sc.nextFloat();
        System.out.println("Enter Number 2: ");
        num2 = sc.nextFloat();

        add = num1 + num2;
        sub = num1 - num2;
        multiply = num1 * num2;
        divide = num1 / num2;

        System.out.println("Sum is: "+add);
        System.out.println("Subtract is: "+sub);
        System.out.println("Multiply is: "+multiply);
        System.out.println("Divide is: "+divide);
    }
}

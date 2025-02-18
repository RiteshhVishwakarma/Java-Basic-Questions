import java.util.Scanner;

// WAP to swap given two numbers
public class SwapUsingClass {
    Scanner sc = new Scanner(System.in);
    float num1, num2, temp;

    void input(){
        System.out.print("Enter Number 1: ");
        num1 = sc.nextFloat();
        System.out.print("Enter Number 2: ");
        num2 = sc.nextFloat();
    }
    void operation(){
        temp = num1;
        num1 = num2;
        num2 = temp;
    }
    void output(){
        System.out.println("Swap is: "+ num1+" "+num2);
    }

    public static void main(String[] args) {
        SwapUsingClass obj = new SwapUsingClass();
        obj.input();
        obj.operation();
        obj.output();
    }
}

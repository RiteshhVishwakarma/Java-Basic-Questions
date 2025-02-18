// WAP to Add given two numbers

import java.util.Scanner;

public class AdditionUsingClass {
    float num1, num2,sum;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.print("Enter Number 1: ");
        num1 = sc.nextFloat();
        System.out.print("Enter Number 2: ");
        num2 = sc.nextFloat();
    }

    void output(){
        sum = num1+num2;
        System.out.println("Sum is: "+sum);
    }
    public static void main(String[] args) {
        AdditionUsingClass obj = new AdditionUsingClass();
        obj.input();
        obj.output();
    }
}

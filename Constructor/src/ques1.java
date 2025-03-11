
//import java.io.*;

import java.util.Scanner;

// Driver Class
class ques1 {
    Scanner sc = new Scanner(System.in);
    void inp(){
        int num1, num2, sum;
        System.out.println("Enter Num1 and num2");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1+num2;
        System.out.println("addition is: "+sum);
    }

    // Constructor
    ques1()
    {
        inp();
    }

    // main function
    public static void main(String[] args)
    {
        ques1 sk = new ques1();
    }
}

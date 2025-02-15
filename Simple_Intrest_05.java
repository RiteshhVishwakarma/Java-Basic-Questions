//Write a program to calculate simple interest and final amount paid to the bank. (( P * r * t) /100)

import java.util.Scanner;
public class Simple_Intrest_05 {
    public static void main(String[] args) {
        float si, p, t, r;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle:  ");
        p = sc.nextFloat();
        System.out.print("Enter rate:  ");
        r = sc.nextFloat();
        System.out.print("Enter Time:  ");
        t = sc.nextFloat();


        si = (p*r*t)/100;

        System.out.println("Si: "+si);
    }
}

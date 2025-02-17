//Write a program to check given person can vote or not.

import java.util.Scanner;

public class PersonVoteOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("Enter Your Age: ");
        age=sc.nextInt();

        if(age<18){
            System.out.println("You Can not Vote");
        }
        else {
            System.out.println("You Can Vote");
        }
    }
}

// Write a program to find area of a square. ( side * side)

import java.util.Scanner;
public class area_Of_Square_9 {
    public static void main(String[] args){
        int num, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();
        result = num*num;
        System.out.println("Square is: "+result);
    }
}

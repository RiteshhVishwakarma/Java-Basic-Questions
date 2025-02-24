// using class and object
// Write a program to find area of a rectangle. ( length * width)
import java.util.Scanner;

public class Area_Of_Rectangle_11{
    float length, width, area;
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.println("Enter Length: ");
        length = sc.nextFloat();
        System.out.println("Enter Width: ");
        width = sc.nextFloat();
    }

    void lenght_calculation(){
        area = length*width;
    }

    void output(){
        System.out.println("Area of rectangle is: "+area);
    }
    public static void main(String[] args) {
        Area_Of_Rectangle_11 obj = new Area_Of_Rectangle_11();
        obj.input();
        obj.lenght_calculation();
        obj.output();
    }

}

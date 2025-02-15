// Square and cube using class and object
import java.util.Scanner;
public class SquareAndCube28 {
    float num1, cube, square;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.print("Enter number: ");
        num1 = sc.nextFloat();
    }

    void operation(){
        cube = num1*num1*num1; // For cube
        square = num1 * num1;
    }
    void output(){
        System.out.println("Cube is: "+cube);
        System.out.println("Square is: "+square);
    }

    public static void main(String[] args) {
        SquareAndCube28 obj = new SquareAndCube28();
        obj.input();
        obj.operation();
        obj.output();
    }

}

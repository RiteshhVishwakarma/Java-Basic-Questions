// Write a program to find perimeter of a square. (4 * side)
import java.util.Scanner;
public class perimeter_Of_Side_10 {
    public static void main(String[] args) {
        float side, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side: ");
        side = sc.nextFloat();
        result = 4*side;
        System.out.println("Perimeter of side is: "+result);
    }
}

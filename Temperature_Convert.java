import java.util.Scanner;

//7. Write a program to convert temperature from Fahrenheit to Celsius. ((F - 32.0) * 5/9)
//formula: °C = (40° - 32) × 5/9 = 4.4°C.
public class Temperature_Convert {
    public static void main(String[] args) {
        float f, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fahrenheit temp : ");
        f = sc.nextFloat();

        c = (f-32)*5/9;
        System.out.println(c);
    }

}

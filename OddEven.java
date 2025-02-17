import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        number = sc.nextInt();
        if (number%2==0){
            System.out.println(number+" is Even");
        }else {
            System.out.println(number+" is Odd");
        }
    }
}

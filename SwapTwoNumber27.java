import java.util.Scanner;

public class SwapTwoNumber27 {
    int num1,num2,temp;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter num1: ");
        num1 = sc.nextInt();

        System.out.println("Enter num2: ");
        num2 = sc.nextInt();

    }
    void before(){
        System.out.println("Before swap: ");
        System.out.println(num1+" "+num2);
    }

    void after(){
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap: ");
        System.out.println(num1+" "+num2);
    }

    public static void main(String[] args) {
        SwapTwoNumber27 obj = new SwapTwoNumber27();
        obj.input();
        obj.before();
        obj.after();
    }
}

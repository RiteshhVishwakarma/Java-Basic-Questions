import java.util.Scanner;

public class LargestOfThree {
    int num1,num2,num3;
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.println("Enter num1: ");
        num1 = sc.nextInt();
        System.out.println("Enter num1: ");
        num2 = sc.nextInt();
        System.out.println("Enter num1: ");
        num3 = sc.nextInt();
    }
    void output(){
        if(num1>num2 && num1>num3 ){
            System.out.println("Num 1 is greater");
        }else if(num2>num1 && num1>num3) {
            System.out.println("number 2 is Greater");
        }else {
            System.out.println("Number 3 is greater");
        }
    }

    public static void main(String[] args) {
        LargestOfThree obj = new LargestOfThree();
        obj.input();
        obj.output();
    }
}

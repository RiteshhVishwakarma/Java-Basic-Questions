import java.util.Scanner;

public class GreaterOfTwo {
    int num1, num2;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.print("Enter Number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        num2 = sc.nextInt();
    }
    void output(){
        if (num1<num2){
            System.out.println("Number 1 is Smaller");
        }
        else {
            System.out.println("Number 2 is Greater");
        }
    }

    public static void main(String[] args) {
        GreaterOfTwo obj = new GreaterOfTwo();
        obj.input();
        obj.output();
    }
}

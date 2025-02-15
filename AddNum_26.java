import java.util.Scanner;

// WAP to add given two numbers
public class AddNum_26 {
    int num1,num2,sum;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.print("Enter num1: ");
        num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        num2 = sc.nextInt();
    }
    void result(){
        sum = num1 + num2;
    }

    void output(){
        System.out.println("Sum is: "+sum);
    }

    public static void main(String[] args) {
        AddNum_26 obj = new AddNum_26();
        obj.input();
        obj.result();
        obj.output();
    }
}

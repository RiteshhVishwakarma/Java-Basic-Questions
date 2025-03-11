import java.util.Scanner;

//WAP to find factorial of given number using default constructor.
public class Que2 {
    Scanner sc = new Scanner(System.in);
    int user;
    int fact=1;
    void factorial(){
        System.out.println("Enter num: ");
        user = sc.nextInt();

        for(int i = 1; i<=user; i++){
            fact = fact * i;
    ;    }
        System.out.println(fact);

    }

    Que2(){
        factorial();
    }



    public static void main(String[] args) {
        Que2 obj = new Que2();
    }
}

import java.util.Scanner;

public class ArraySumOfAllElements {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    int sum = 0;
    void input(){
        System.out.println("Enter any 5 numbers: ");
        for (int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void output(){
        for(int i=0; i<5; i++){
            sum = sum+arr[i];
        }
        System.out.print("Sum of All element is : "+sum);
    }
    public static void main(String[] args){
        ArraySumOfAllElements obj = new ArraySumOfAllElements();
        obj.input();
        obj.output();
    }
}

import java.util.Scanner;

public class MaxOfArrayElement45 {
    int sizeOfArray;
    int[] arr;
    int max = Integer.MIN_VALUE;

    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.println("Enter Size Of Array: ");
        sizeOfArray = sc.nextInt();
         arr = new int[sizeOfArray];

        System.out.println("Enter any "+sizeOfArray+" Numbers: ");
        for(int i = 0; i<sizeOfArray; i++){
            arr[i] = sc.nextInt();
        }
    }

    void output(){
        for (int i=0; i<sizeOfArray; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

        for (int index =0; index < sizeOfArray; index++ ){
            if(arr[index] > max){
                max = arr[index];
            }
        }
        System.out.println("Max is: "+max);
    }

    public static void main(String[] args) {
        MaxOfArrayElement45 obj = new MaxOfArrayElement45();

        obj.input();
        obj.output();
    }
}

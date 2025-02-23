import java.util.Scanner;

public class MinInArray {
    Scanner sc = new Scanner(System.in);
    int[] arr;
    int sizeOf;
    int min = Integer.MAX_VALUE;

    void input(){
        System.out.println("Enter Size of Array: ");
        sizeOf = sc.nextInt();

        arr = new int[sizeOf];

        System.out.println("Enter any "+sizeOf+" numbers: ");
        for (int i = 0; i<sizeOf; i++ ){
            arr[i] = sc.nextInt();
        }
    }

    void output(){
        for (int i = 0; i<sizeOf; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min is: "+min);
    }

    public static void main(String[] args) {
        MinInArray obj = new MinInArray();
        obj.input();
        obj.output();
    }
}

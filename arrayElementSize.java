import java.util.Scanner;

//WAP to array size from user
public class arrayElementSize {
    public static void main(String[] args) {

        int elementSize;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Element: ");
        elementSize = sc.nextInt();

        int arr[] = new int[elementSize];
        System.out.println("Enter number to add in array: ");

        for(int i = 0; i<elementSize; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<elementSize; i++){
            System.out.println(arr[i]);
        }
    }



}

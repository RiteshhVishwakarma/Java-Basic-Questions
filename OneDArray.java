import java.util.Scanner;

public class OneDArray {

    Scanner sc = new Scanner(System.in);
    int arr[]= new int[10];
    int i;

    void input()
    {
        System.out.println("Enter any Ten numbers");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
    }

    void output()
    {
        System.out.println("The entered numbers are :");
        for(i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        OneDArray obj = new OneDArray();
        obj.input();
        obj.output();
}

}
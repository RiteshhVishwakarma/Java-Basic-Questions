import java.util.Scanner;

public class OccuranceOfElement {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    int count = 0;
    int user ;

    void input(){
        System.out.println("Enter Any 5 Numbers: ");
        for (int i = 0; i < arr.length; i++){
            arr[i]=sc.nextInt();
        }
    }

    void userNum(){
        for (int j = 0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println(" ");
        System.out.println("Enter Number to fine Occurance: ");
        user = sc.nextInt();
    }

    void output(){

        for (int i=0; i<arr.length; i++){
            if(arr[i] == user){
                count++;
            }
        }
        System.out.println(user+" is: "+count+" time");
    }

    public static void main(String[] args) {
        OccuranceOfElement obj = new OccuranceOfElement();

        obj.input();
        obj.userNum();
        obj.output();
    }
}

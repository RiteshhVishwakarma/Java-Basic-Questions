public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 25};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest element: " + max);
    }
}

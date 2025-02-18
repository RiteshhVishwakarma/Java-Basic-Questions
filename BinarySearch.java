class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // Avoids integer overflow

            if (arr[mid] == target)
                return mid;  // Found the target

            if (arr[mid] < target)
                left = mid + 1;  // Search right half
            else
                right = mid - 1;  // Search left half
        }

        return -1;  // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 23, 45, 67};
        int target = 10;
        int result = binarySearch(arr, target);

        if (result != -1)
            System.out.println("Element found at Position " + (result+1)+" and Index: "+result);
        else
            System.out.println("Element not found");
    }
}

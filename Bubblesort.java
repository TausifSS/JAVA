public class Sort {

    // Method to print the elements of the array
    public static void printArr(int arr[]) {
        // Loop through the array and print each element
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Initialize an array with unsorted elements
        int arr[] = {7, 8, 5, 4, 2, 3, 1};

        // Outer loop for the number of passes needed to sort the array
        for (int i = 0; i < arr.length; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Check if the current element is greater than the next element
                if (arr[j] >= arr[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Call the method to print the sorted array
        printArr(arr);
    }
}

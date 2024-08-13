public class BubbleSort {
    public static void bubblesort(int[] arr, int N) {
        // Outer loop to control the number of passes
        for (int i = 0; i < N - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < N - i - 1; j++) {
                // Swap if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

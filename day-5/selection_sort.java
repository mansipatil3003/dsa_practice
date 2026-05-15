public class selection_sort {
    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        // Selection Sort Logic
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            // Find smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
    

import java.util.Arrays;

class SortingAlgo {

    public static void main(String[] args) {
        int[] arr = { 100, 355, 170, 320, 388, 483, 498, 394, 23, 175, 293, 71, 150, 73, 403, 43, 281, 11, 45, 55, 181,
                191, 124, 205, 334, 326, 407, 400, 135, 290, 347, 264, 444, 225, 496, 160, 358, 187, 130, 32, 113, 408,
                190, 173, 41, 215, 24, 453, 208, 401, 387, 495, 121, 278, 288, 367, 209, 47, 328, 346, 118, 177, 286,
                486, 338, 57, 438, 96, 257, 343, 62, 480, 306, 137, 168, 109, 333, 321, 166, 86, 52, 61, 412, 311, 451,
                115, 302, 123, 95, 218, 270, 37, 196, 335, 174, 194, 110, 398, 117, 450 };
        // int n = arr.length;

        // quickSort(arr, 0, n - 1);
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    static void quickSort(int[] arr, int left, int right) {
        if (left < right) {

            int partitionValue = partition(arr, left, right);
            quickSort(arr, left, partitionValue - 1);
            quickSort(arr, partitionValue + 1, right);
        }
    }

    static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];

        int i = left - 1;

        for (int j = left; j <= right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

}

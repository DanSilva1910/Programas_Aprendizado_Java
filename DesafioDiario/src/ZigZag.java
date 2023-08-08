public class ZigZag {
    public static void main(String[] args) {
        int[] zigZag = { 8, 10, 9, 5, 1, 7, 1, 0 };

        zigZag(zigZag);

        for (int i : zigZag) {

            System.out.print(i + " ");
        }
    }

    public static void zigZag(int[] arr) {

        boolean shouldSwap = true;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (shouldSwap) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    System.out.println(arr[i] + " " + arr[i + 1]);
                }
            }

            else {
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                    // System.out.println(arr[i] + " " + arr[i + 1]);
                }
            }
            shouldSwap = !shouldSwap;

            for (int a : arr) {

                System.out.print(a + " ");
            }
            System.out.println();
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

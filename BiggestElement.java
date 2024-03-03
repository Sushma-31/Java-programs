public class BiggestElement {
    public static int findBiggest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5, 1, 4, 8, 6};
        int biggest = findBiggest(arr);
        System.out.println("Biggest Element: " + biggest);
    }
}

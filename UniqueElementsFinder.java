import java.util.*;

public class UniqueElementsFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7, 8, 9, 9};

        Set<Integer> uniqueElements = findUniqueElements(arr);

        System.out.println("Unique elements in the array:");
        for (int element : uniqueElements) {
            System.out.print(element + " ");
        }
    }

    public static Set<Integer> findUniqueElements(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            uniqueElements.add(num);
        }

        return uniqueElements;
    }
}

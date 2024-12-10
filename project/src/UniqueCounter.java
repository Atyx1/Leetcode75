import java.util.*;

public class UniqueCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1, 4, 5};
        System.out.println("Number of unique elements: " + countUnique(numbers));
    }

    public static int countUnique(int[] arr) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!uniqueSet.contains(arr[i])) {
                uniqueSet.add(arr[i]);
            }
        }
        return uniqueSet.size() + 1; 
    }
}
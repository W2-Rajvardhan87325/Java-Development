import java.util.*;

public class Program {
    
    // Method to find the maximum number from a List of Numbers
    public static <T extends Comparable<T>> T findMax(List<T> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("The list is empty or null.");
        }
        
        T max = numbers.get(0);
        for (T number : numbers) {
            if (number.compareTo(max) > 0) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Creating various lists
        List<Integer> intList = Arrays.asList(10, 20, 30, 5, 40);
        List<Double> doubleList = Arrays.asList(10.5, 20.2, 30.1, 5.5, 40.8);
        List<Float> floatList = Arrays.asList(10.1f, 20.4f, 30.6f, 5.2f, 40.9f);
        List<Long> longList = Arrays.asList(100L, 200L, 300L, 50L, 400L);

        // Finding and printing the maximum from each list
        System.out.println("Maximum in Integer List: " + findMax(intList));
        System.out.println("Maximum in Double List: " + findMax(doubleList));
        System.out.println("Maximum in Float List: " + findMax(floatList));
        System.out.println("Maximum in Long List: " + findMax(longList));
    }
}

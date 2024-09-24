import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        
        String[] array1 = {"apple", "banana", "orange", "mango", "grape"};
        String[] array2 = {"peach", "banana", "apple", "pineapple", "orange"};

       
        Set<String> duplicates = new HashSet<>();

       
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) { // Use equals() to compare strings
                    duplicates.add(array1[i]); 
                }
            }
        }

        // Display the duplicate values
        if (!duplicates.isEmpty()) {
            System.out.println("Duplicate values are: " + duplicates);
        } else {
            System.out.println("No duplicate values found.");
        }
    }
}

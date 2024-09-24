import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
       
        TreeSet<String> colorSet = new TreeSet<>();

        
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Green");
        colorSet.add("Yellow");
        colorSet.add("Orange");

       
        System.out.println("Colors in the TreeSet:");
        for (String color : colorSet) {
            System.out.println(color);
        }
    }
}

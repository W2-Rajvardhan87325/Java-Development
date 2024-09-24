import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
       
        ArrayList<String> colors = new ArrayList<>();


        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

       
        System.out.println("Original list: " + colors);

       
        String newElement = "Orange";  
        if (colors.size() > 1) {
            colors.set(1, newElement);  
        }

        
        System.out.println("Modified list: " + colors);
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
      
        String filePath = "\"E:\\D-Mobile Computing\\JAVA\\DAY 11\\demo00\\Empty.txt\""; // Replace with your file path
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print out the content stored in the array
        System.out.println("Content of the file:");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

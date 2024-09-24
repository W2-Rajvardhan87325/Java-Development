import java.io.*;
import java.util.StringTokenizer;

public class Program3 {
    public static void main(String[] args) {
        // Specify the path to the text file
        String filePath = "\"E:\\D-Mobile Computing\\JAVA\\DAY 11\\demo00\\Empty.txt\""; // Replace with your file path
        String longestWord = "";
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line);
                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken();
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output the longest word
        System.out.println("The longest word in the file is: " + longestWord);
    }
}

import java.io.File;

public class Program1 {
    public static void main(String[] args) {
      
        String path = "\"E:\\D-Mobile Computing\\JAVA\\DAY 11\\demo00\\Empty.txt\""; 
     
        File file = new File(path);

       
        if (file.exists()) {
            System.out.println("The file or directory exists.");
        } else {
            System.out.println("The file or directory does not exist.");
        }
    }
}

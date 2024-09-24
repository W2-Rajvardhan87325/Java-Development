import java.io.File;

public class Program4 {
    public static void main(String[] args) {
       
        String filePath = "\"E:\\D-Mobile Computing\\JAVA\\DAY 11\\demo00\\Empty.txt\""; // Replace with your file path
        
        
        File file = new File(filePath);
        
       
        if (file.isHidden()) {
            System.out.println("The file is hidden.");
        } else {
            System.out.println("The file is not hidden.");
        }
    }
}

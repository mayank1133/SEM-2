import java.io.File;
import java.nio.file.Files;

public class FileChecker {
    public static void main(String[] args) {
       String path = args[0];
       File f_d = new File(path); 
        if (f_d.isFile()) {
            try {
                System.out.println("File size");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (f_d.isDirectory()) {
            if (files == null) {
                System.err.println(" list files in directory: " + path);
                File f[]= f_d
                System.exit(1);
            }
            System.out.println(path.getName() + " is a directory containing the following files:");
            for (File file : files) {
                System.out.println("- " + file.getName());
            }
        } else {
            System.out.println(path + " is neither a file nor a directory.");
        }
    }
}
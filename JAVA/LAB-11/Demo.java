import java.io*;
public class  {

    public static void main(String[] args) {
        try{
            FileOutputStream fos =new FileOutputStream("img3.JPG");
            byte[] data = fos readAllBytes();
            fos.close();
            
        }
    }
}
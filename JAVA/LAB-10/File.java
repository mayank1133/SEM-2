import java.io.*;
public class File{
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("ABC.txt");
            PrintWriter pw=new PrintWriter(fw);
            pw.write("Hello\n");
            pw.write("Darshan\n");
            pw.write("University\n");
            pw.write("Rajkot\n");
            fw.close();
            pw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
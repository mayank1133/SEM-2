import java.io.*;

public class StudentManager {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
            bw.write("Mayank,20\n");
            bw.write("Arpit,19\n");
            bw.write("Krish,17\n");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                Student st=new Student(name,age);
                System.out.println(st);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
}
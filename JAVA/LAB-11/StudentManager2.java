import java.io.*;
class Student2 {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentManager2 {
    public static void main(String[] args) {
        String filename = "student2.txt";
        try  {
            FileOutputStream fo = new FileOutputStream("student2.txt");
            DataOutputStream writer = new DataOutputStream(new FileOutputStream("students.bin"))
            dis.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream reader = new DataInputStream(new FileInputStream("students.bin"))) {
            while (dis.available()>0) {
                String name = dis.readUTF();
                int age = dis.readInt();
                Student student = new Student(name, age);
                System.out.println(student);
                dis.close;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
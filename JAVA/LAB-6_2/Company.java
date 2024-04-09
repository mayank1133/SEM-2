class Member{
    String name;
    int age;
    String phone_number;
    String address;
    double salary;
    public void printSalary(){
        System.out.println("Salary"+salary);
    }
    public Member(String name,int age,String phone_number,String address,double salary){
        this.name=name;
        this.age=age;
        this.phone_number=phone_number;
        this.address=address;
        this.salary=salary;
    }
    public void printDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:",+age);
        System.out.println("Number:"+phone_number);
        System.out.println("Address:"+address);
        System.out.println("Salary:"+salary);
    }
}
class Employee extends Member{
    String specialization;
    public Employee(String name,int age,String phone_number,String address,double salary,String specialization){
        super(String name,int age,String phone_number,String address,double salary);
        this.specialization=specialization;
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("Specialization:"+specialization);
    }
}
class Manager extends Member{
    String department;
    public manager(String name,int age,String phone_number,String address,double salary,String department){
        this.department=department;
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("Department:"+department);
    }
}
public class Company{
    public static void main(String[] args) {
        Employee e1=new Employee("Mayank",21,"9978641133",Darshanuni,50000,"java");
        Manager m1=new Manager("arpit",19,"7894561230","Darshan",50000,"HOD");
        e1.printDetails();
        m1.printDetails();
    }
}

class Student{
    String name;
    int age;

    public void s_info(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
    public void s_info(String name){
        System.out.println(name);
    }
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
}
public class polymorp{
    public static void main(String[] args){
        Student student1=new Student("Alice",20);
        student1.s_info(student1.name,student1.age); // calling method with two parameters
        student1.s_info(student1.name); // calling method with one parameter
    }
}
import bank.*; // import all classes from bank package
class Pen{
    String colour;
    String type;

    public void Write(){
        System.out.println("Writing");
    }
    public void color(){
        System.out.println(this.colour);
    }
}
class Student{
    String name;
    int age;
    int number;
    public void s_info(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.number);
    }
}
class Car{
    String color;
    String type;
    int speed;

    public void start(){
        System.out.println("car started");
    }
    public void stop(){
        System.out.println("car stopped");
    }
    Car(){
        System.out.println("=======constructor1 called=========");
        this.color="red";
        this.type="sedan";
        this.speed=100;
    }
}
class Animal{
    String name;
    String colour;
    public void eat(){
        System.out.println("eating");
    }

    Animal(String name, String colour){
        System.out.println("=======constructor2 called=========");
        this.name=name;
        this.colour=colour;
    }
}
class Bike{
    String color;
    int maxSpeed;
    Bike(Bike b1){
        System.out.println("=======constructor3 called=========");
        this.color=b1.color;
        this.maxSpeed=b1.maxSpeed;
    }
    Bike(){
        System.out.println("=======constructor4 called=========");
    }
}
public class oops{
    public static void main(String[] args){
        Pen pen1= new Pen();
        pen1.colour="blue";
        pen1.type="gel";
        pen1.Write();
        pen1.color();
        Pen pen2= new Pen();
        pen2.colour="black";
        pen2.type="ballpoint";
        pen2.color();

        Student student1=new Student();
        student1.name="Amit";
        student1.age=18;
        student1.number=123234;
        student1.s_info();

        Car car1=new Car();
        System.out.println(car1.color); // accessing default color
        car1.color="blue";
        System.out.println(car1.color); // accessing modified color

        Animal animal1=new Animal("Lion","Golden");
        System.out.println(animal1.name);
        System.out.println(animal1.colour);

        Bike bike1=new Bike();
        bike1.color="Black";
        bike1.maxSpeed=150;
        Bike bike2=new Bike(bike1);
        System.out.println(bike2.color);

        Account acc1=new Account(); // create an Account object from bank package
        acc1.holder_name="John Doe";
        acc1.account_number=120;
        acc1.balance=10000;
        acc1.deposit(5000);
        acc1.withdraw(20000);
    }
}
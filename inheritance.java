
class Shape{
    String colour;

}
class Triangle extends Shape{
    int base;
    int height;

    public void area(){
        System.out.println(0.5*base*height);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Triangle t1=new Triangle();
        t1.base=5;
        t1.height=10;
        t1.colour="blue"; // inherited property
        t1.area();
        System.out.println(t1.colour); 
    }
}

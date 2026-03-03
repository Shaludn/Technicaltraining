package Assignment2;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape{
    int l=10, b=20;
    @Override
    public double area(){
        int a= l*b;
        System.out.println("The area of retangle is :"+ a);
        return 0;
    }
}

class Circle extends Shape{
    int r=4;
    @Override
    public double area(){
        double area=3.14*r*r;
        System.out.println("The area of circle is:"+ area);
        return 0;
    }

}

class Main{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        r.area();
        c.area();
    }
}

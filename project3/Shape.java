package project3;

public interface Shape {

    void calculateArea();

    void calculatePerimeter();
}

class Circle implements Shape{
    int rad;
    final double pi=Math.PI;

    Circle(int rad){
        this.rad=rad;
    }

    @Override
    public void calculateArea() {
    double area= ((rad*rad)*pi);
        System.out.println("The Area of your circle is "+area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter= 2*rad*pi;
        System.out.println("The perimeter of your circle is "+perimeter);
    }
}

class Square implements Shape{
    int num1;
    Square(int num1){
        this.num1=num1;
    }

    @Override
    public void calculateArea() {

        double area= num1*2;
        System.out.println("The Area of your square is "+area);

    }

    @Override
    public void calculatePerimeter() {

        double perimeter=(num1+num1+num1+num1);
        System.out.println("The perimeter of your rectangle is "+perimeter);

    }
}

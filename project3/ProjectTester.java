package project3;

public class ProjectTester {
    public static void main(String[] args) {

        Circle circle=new Circle(15);
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square=new Square(5);
        square.calculateArea();
        square.calculatePerimeter();

        StudentA studentA=new StudentA(3.6,2.9,3.9);
        studentA.getPercentage();
        StudentB studentB=new StudentB(3.8,2.5,2.8,3.2);
        studentB.getPercentage();

        Truck truck1=new Truck(20000, "Blue", 3000);
        truck1.calculateSalesPrice();
        Truck truck2=new Truck(20000, "Blue", 1000);
        truck2.calculateSalesPrice();
        Sedan sedan1=new Sedan(15000, "White", 25);
        sedan1.calculateSalesPrice();
        Sedan sedan2=new Sedan(15000, "White", 15);
        sedan2.calculateSalesPrice();

        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.close();
        chromeDriver.getTitle();
        chromeDriver.navigate();
        chromeDriver.open();
        FireFoxDriver fireFoxDriver=new FireFoxDriver();
        fireFoxDriver.close();
        fireFoxDriver.getTitle();
        fireFoxDriver.navigate();
        fireFoxDriver.open();
        SafariDriver safariDriver=new SafariDriver();
        safariDriver.close();
        safariDriver.getTitle();
        safariDriver.navigate();
        safariDriver.open();


        /*-----------OUTPUT OF CODE----------------
        The Area of your circle is 706.8583470577034
        The perimeter of your circle is 94.24777960769379
        The Area of your square is 10.0
        The perimeter of your rectangle is 20.0
        Your grade average is 3.466666666666667
        Your grade average is 3.075
        Truck price is: 18000.0$
        Truck price is: 16000.0$
        Sedan price is: 14250.0$
        Sedan price is: 13500.0$*/
    }
}

package project3;

public class Car {

    double carPrice;
    String carColor;

    Car(double carPrice, String carColor){
        this.carPrice=carPrice;
        this.carColor=carColor;
    }

    public void calculateSalesPrice(){
        System.out.println("The car costs: "+carPrice+"$");
    }
}

class Truck extends Car{
    int weight;

    Truck(double carPrice, String carColor, int weight){
        super(carPrice, carColor);
        this.weight=weight;
    }

    @Override
    public void calculateSalesPrice() {
        if (weight>2000){
            System.out.println("Truck price is: "+(carPrice*0.9)+"$");
        }else{
            System.out.println("Truck price is: "+(carPrice*0.8)+"$");
        }
    }
}

class Sedan extends Car{
    int length;

    Sedan(double carPrice, String carColor, int length){
        super(carPrice, carColor);
        this.length=length;
    }

    @Override
    public void calculateSalesPrice() {
        if (length>20){
            System.out.println("Sedan price is: "+(carPrice*0.95)+"$");
        }else{
            System.out.println("Sedan price is: "+(carPrice*0.9)+"$");
        }
    }
}

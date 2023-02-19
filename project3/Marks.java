package project3;

public abstract class Marks {

    abstract void getPercentage();

}

class StudentA extends Marks{
    double mark1; double mark2; double mark3;

    StudentA(double mark1, double mark2, double mark3){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }

    @Override
    void getPercentage() {
        double average= (mark1+mark2+mark3)/3;
        System.out.println("Your grade average is "+average);
    }
}

class StudentB extends Marks{
    double mark1; double mark2; double mark3; double mark4;

    StudentB(double mark1, double mark2, double mark3, double mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    void getPercentage() {
        double average= (mark1+mark2+mark3+mark4)/4;
        System.out.println("Your grade average is "+average);
    }
}
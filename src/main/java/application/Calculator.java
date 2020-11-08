package application;

public class Calculator {

    //***************Simple methods************************

    public int add(int a, int b) {
        return a + b;
    }

    //TODO add method for subtraction
    public int sub(int a, int b) { return a - b; }
    //TODO add method for multiplication
    public int mul(int a, int b) { return a * b; }
    //TODO add method for division
    public int div(int a, int b) { return a / b; }
    //TODO add method for square root (use Math class)
    public double squ(int a) { return Math.sqrt(a); }
    //TODO add method for x^2
    public double pow(int a) { return Math.pow(a, 2); }
    //***************Medium methods************************

    //TODO (*) |average value| add method which calculate average value of 3 numbers
    public double average(double a, double b, double c) { return (a+b+c)/3; }
    //TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd
    public boolean evenOrOdd(int a){
        return a%2==0;
    }
    //TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals
    public int biggestValue(int a, int b){
        if (a==b){ return 0;}
        else return Math.max(a, b);
    }
    //***************Hard methods************************

    //TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter
    public int multiAddition(int...params){
        int result = 0;
        for(int parameter : params){
            result = result + parameter;
        } return result;
    }
    //TODO (*) |divide by zero case| add method for division (check division by zero case
    // - if we try to divide by zero - return -100;
    public double zeroDivision(double a, double b){
        if(b==0){return -100;}
        else return a / b;
    }

}








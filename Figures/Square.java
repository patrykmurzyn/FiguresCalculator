package com.hello.Figures;

public class Square extends Figure implements Printable{

    double a;

    public Square(double a) {
        if(a > 0) this.a = a;
        else System.out.println("Nieprawidłowe dane!");
    }

    public Square() {
        this.a = 0;
    }

    public void changeData(double num) {
        if(num > 0) this.a = num;
        else System.out.println("Nieprawidłowe dane!");
    }

    @Override
    public void print() {
        System.out.println("Square{" +
                "a=" + String.format("%.2f", a) +
                ", area=" + String.format("%.2f", this.calculateArea()) +
                ", perimeter=" + String.format("%.2f", this.calculatePerimeter()) +
                '}');
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }

    public double getA() {
        return a;
    }
}

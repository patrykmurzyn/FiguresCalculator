package com.hello.Figures;

public class Circle extends Figure implements Printable{

    double r;

    public Circle(double r) {
        if(r > 0) this.r = r;
        else System.out.println("Nieprawidłowe dane!");
    }

    public Circle() {
        this.r = 0;
    }

    public void changeData(double num) {
        if(num > 0) this.r = num;
        else System.out.println("Nieprawidłowe dane!");
    }

    @Override
    public void print() {
        System.out.println("Circle{" +
                "r=" + String.format("%.2f", r) +
                ", area=" + String.format("%.2f", this.calculateArea()) +
                ", perimeter=" + String.format("%.2f", this.calculatePerimeter()) +
                '}');
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}

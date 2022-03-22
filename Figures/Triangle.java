package com.hello.Figures;

public class Triangle extends Figure implements Printable{

    double a, h;

    public Triangle(double a) {
        if(a > 0) {
            this.a = a;
            this.h = 0.5d * Math.sqrt(3) * a;
        }
        else System.out.println("Nieprawidłowe dane!");
    }

    public Triangle() {
            this.a = 0;
    }

    public void changeData(double num) {
        if(a > 0) {
            this.a = num;
            this.h = 0.5d * Math.sqrt(3) * num;
        }
        else System.out.println("Nieprawidłowe dane!");
    }

    @Override
    public void print() {
        System.out.println("Triangle{" +
                "a=" + String.format("%.2f", a) +
                ", h=" + String.format("%.2f", h) +
                ", area=" + String.format("%.2f", this.calculateArea()) +
                ", perimeter=" + String.format("%.2f", this.calculatePerimeter()) +
                '}');
    }

    @Override
    public double calculateArea() {
        return 0.5d * a * h;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * a;
    }

    public double getA() {
        return a;
    }
}

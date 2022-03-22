package com.hello.Figures;

public abstract class Figure implements Printable {

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public abstract void print();

    public abstract void changeData(double num);
}

package com.hello.Solids;

import com.hello.Figures.*;

public class Prism extends Solid implements Printable {

    Figure base;
    double h;

    public Prism(Figure base, double h) {
        if(h > 0) {
            this.base = base;
            this.h = h;
        } else System.out.println("Nieprawidłowe dane!");

    }

    @Override
    public void print() {

        System.out.println("Prism{" +
                "base=" + base.getClass().getSimpleName() +
                ", h=" + String.format("%.2f", h) +
                ", field=" + String.format("%.2f", this.calculateField()) +
                ", volume=" + String.format("%.2f", this.calculateVolume()) +
                '}');
    }

    public double calculateField() {

        if(base instanceof Square) {
            return 2 * base.calculateArea() + 4 * ((Square) base).getA();
        } else if(base instanceof Triangle) {
            return 2 * base.calculateArea() + 3 * ((Triangle) base).getA();
        } else {
            System.out.println("Nieprawidłowe dane!");
        }

        return 0;
    }

    public double calculateVolume() {
        if(!(base instanceof Circle)) {
            return base.calculateArea() * h;
        }
        else System.out.println("Nieprawidłowe dane!");

        return 0;

    }

}

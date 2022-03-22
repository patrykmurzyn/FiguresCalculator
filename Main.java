package com.hello;

import com.hello.Figures.Circle;
import com.hello.Figures.Figure;
import com.hello.Figures.Square;
import com.hello.Figures.Triangle;
import com.hello.Solids.Prism;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isEnd = false;
        boolean isChosen = false;

        Figure figure;
        figure = new Circle(2);

        do {
            System.out.println("Aktualne Dane: ");
            if(isChosen) figure.print();
            else System.out.println("brak");

            System.out.println();
            System.out.println("---  Menu:  ---");
            System.out.println("1) Wybór figóry");
            System.out.println("2) Zmiana danych");
            System.out.println("3) Wyjście z programu");

            System.out.println("Wybór: ");
            int numInt = scanner.nextInt();

            switch(numInt) {
                case 1:
                    System.out.println("--  Wybór figóry:  --");
                    System.out.println("1) Kwadrat");
                    System.out.println("2) Trójkąt");
                    System.out.println("3) Koło");

                    numInt = scanner.nextInt();

                    switch (numInt) {
                        case 1:
                            figure = new Square();
                            isChosen = true;
                            break;
                        case 2:
                            figure = new Triangle();
                            isChosen = true;
                            break;
                        case 3:
                            figure = new Circle();
                            isChosen = true;
                            break;
                        default:
                            System.out.println("Niepoprawny wybór!");
                            break;
                    }

                    break;
                case 2:
                    if(figure instanceof Circle && isChosen) {
                        System.out.println("Podaj długość promienia koła: ");
                        double numDouble = scanner.nextDouble();
                        figure.changeData(numDouble);
                    }
                    else if(figure instanceof Square) {
                        System.out.println("Podaj długość boku kwadratu: ");
                        double numDouble = scanner.nextDouble();
                        figure.changeData(numDouble);
                    }
                    else if(figure instanceof Triangle) {
                        System.out.println("Podaj długość boku trójkąta: ");
                        double numDouble = scanner.nextDouble();
                        figure.changeData(numDouble);
                    }
                    break;
                case 3:
                    isEnd = true;
                    break;
                default:
                    System.out.println("Niepoprawny wybór!");
                    break;
            }

        } while(!isEnd);
    }
}

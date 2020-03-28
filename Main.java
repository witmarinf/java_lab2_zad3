package com.company;

import java.util.Scanner;


public class Main {

    public Main(){
    }//konstruktor


    public static void main(String[] args) {
        System.out.println("Musisz podać liczbe jenostek>0 i liczbe podzialek na jednostke dlugosci>0");

        measure measure = new measure();

        Scanner scanner = new Scanner(System.in);
        int howManyUnits = 0, howMark = 0;

        while(howManyUnits < 1) {

             System.out.println("Podaj liczbe jednostek dlugosci:");

             howManyUnits = scanner.nextInt();

             if (howManyUnits < 1) {

                 System.out.println("Powinno być powyzej 0");
              }
        }

        while(howMark < 1) {
            System.out.println("Podaj ile podzialek na jednostke dlugosci:");
            howMark = scanner.nextInt();
            if (howMark < 1) {

                System.out.println("Powinno być powyzej 0");
            }
        }

        scanner.close();

        System.out.println("miarka");

        measure.graphMeasure(howManyUnits, howMark);

       // measure.clear();
        measure=null;
        System.gc();
    }
}
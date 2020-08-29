/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatestapp.test;

import java.util.Scanner;

/**
 *
 * @author andrz
 */
public class Kalkulator extends CalcOPS {
    Scanner sc = new Scanner();
    System.out.println("Podaj wartość x: ");
    int x = sc.nextInt();
    System.out.println("Podaj wartość y: ");
    int y = sc.nextInt();

    System.out.println("Podaj rodzaj operacji:\n"
                + "1 - Dodawanie,\n"
                + "2 - Odejmowanie,\n"
                + "3 - Mnożenie,\n"
                + "4 - Dzielenie,\n"
                + "0 - Zakończ program.");
    int option = sc.nextInt();
    switch(option){
        case 0:
            System.out.println("Dziękuję, że skorzystałeś z moich usług!\n"
                    + "Pozdrawiam i do zobaczenia w krótce!");
            System.exit(0);
            break;
        case 1:
            System.out.println("Wynik dodawania wartości x i y to: " + CalcOPS.sub(x, y));
            break;
        case 2:
            System.out.println("Wynik odejmowania wartości x i y to: " + CalcOPS.sub(x, y));
            break;
        case 3:
            System.out.println("Wynik mnoenia wartości x i y to: " + CalcOPS.mul(x, y));
            break;
        case 4:
            System.out.println("Wynik dzielenia wartości x i y to: " + CalcOPS.div(x, y));
            break;
    }

    public Kalkulator() {
    }
}

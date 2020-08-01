/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatestapp.main;

import com.mycompany.javatestapp.Person.Czlowiek;
import com.mycompany.javatestapp.Person.Osoba;
import com.mycompany.javatestapp.Person.Person;
import com.mycompany.javatestapp.test.CalcOPS;

import java.io.IOException;
import java.util.Scanner;

//import org.apache.log4j.*;

/**
 *
 * @author andrz
 */
public class Main extends CalcOPS {
    public static void main(String[] args) throws IOException {
        //static Logger logger = Logger.getLogger(Main.class);
        //PropertyConfigurator.configure("log4j.properties");
        int peselLenght = 11;
        System.setProperty("encoding", "UTF-8");
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println(person.getClass());
        System.out.println(person.toString());
        System.out.print("Nadaj imie osobie: ");
        String imie = sc.next();
        person.setImie(imie);
        System.out.println("Person nadałeś imie: " + imie);
        System.out.print("Podaj nazwisko: ");
        String nazwisko = sc.next();
        person.setNazwisko(nazwisko);
        System.out.println("Podałeś nazwisko: " + nazwisko);
        System.out.println("Stworzyłeś osobę: "+imie+" "+nazwisko);
        System.out.print("Podaj swój numer PESEL: ");
        String pesel = sc.next();
            if (pesel.length() != peselLenght){
                System.out.println("Podany PESEL ma nie właściwą długość!");
            }else{
                //return int pesel1;
                System.out.println("Podałeś PESEL: "+ pesel);
                person.setPesel(pesel);
            }
        System.out.print("Konwersja PESEL ze Stringa na intiger: " + Integer.parseInt(pesel));
        System.out.println("Podaj rodzaj operacji:\n"
                + "1 - Dodawanie,\n"
                + "2 - Odejmowanie,\n"
                + "3 - Mnożenie,\n"
                + "4 - Dzielenie,\n"
                + "0 - Zakończ program.");
        int option = sc.nextInt();
        switch (option){
            case 0:
                System.out.println("Dziękuję, że skorzystałeś z moich usług!\n"
                    + "Pozdrawiam i do zobaczenia w krótce!");
                System.exit(0);
                break;
            case 1:
            	System.out.println("Podaj wartość x: ");
            	int x = sc.nextInt();
            	System.out.println("Podaj wartość y: ");
            	int y = sc.nextInt();
            	int sum = x+y;
            	System.out.println("Suma wartości x i y to: "+sum);
            	break;
            default:
                System.exit(0);
        
        }
        
        //logger.debug("Debug info");
        
        
        System.exit(0);
    }
}

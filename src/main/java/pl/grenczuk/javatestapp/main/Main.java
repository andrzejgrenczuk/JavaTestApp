/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.grenczuk.javatestapp.main;

import pl.grenczuk.javatestapp.Person.Person;
import pl.grenczuk.javatestapp.Person.Pesel;
import pl.grenczuk.javatestapp.kalkulator.CalcOPS;
import pl.grenczuk.javatestapp.kalkulator.Kalkulator;

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
        String imie = sc.nextLine();
        person.setImie(imie);
        System.out.println("Person nadałeś imie: " + imie);
        System.out.print("Podaj nazwisko: ");
        String nazwisko = sc.nextLine();
        person.setNazwisko(nazwisko);
        System.out.println("Podałeś nazwisko: " + nazwisko);
        System.out.println("Stworzyłeś osobę: " + imie + " " + nazwisko);
        System.out.print("Podaj swój numer PESEL: ");
        String pesel = sc.nextLine();
        if (pesel.length() != 11) {
            System.out.println("Podany PESEL ma nie właściwą długość!");
            Pesel.PeselValidator(pesel);

        } else {
            //return int pesel1;
            System.out.println("Podałeś PESEL: " + pesel);
            person.setPesel(pesel);
        }
        /*System.out.println("Podałeś PESEL: "+ pesel.toString());
        person.setPesel(pesel);*/
        System.out.println("Konwersja PESEL ze Stringa na Long: " + Long.parseLong(pesel));
        System.out.println("Ważne, okazuje się że numer PESEL nie może być typu Integer, ponieważ nie jest wstanie zmiescić długości 11 znaków");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        //Kalkulator kalk = new Kalkulator();
        Kalkulator.run();


    }

}

        


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatestapp.Person;

/**
 *
 * @author andrz
 */
public class Osoba extends Czlowiek {
    String imie;
    String nazwisko;
    String email;
    String nazwiskoPanienskieMatki;
    String  pesel;
    String adresZamieszkania;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNazwiskoPanienskieMatki() {
        return nazwiskoPanienskieMatki;
    }

    public void setNazwiskoPanienskieMatki(String nazwiskoPanienskieMatki) {
        this.nazwiskoPanienskieMatki = nazwiskoPanienskieMatki;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getAdresZamieszkania() {
        return adresZamieszkania;
    }

    public void setAdresZamieszkania(String adresZamieszkania) {
        this.adresZamieszkania = adresZamieszkania;
    }

    public Osoba() {
    }

    public Osoba(String imie, String nazwisko, String email, String nazwiskoPanienskieMatki, String pesel, String adresZamieszkania) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.nazwiskoPanienskieMatki = nazwiskoPanienskieMatki;
        this.pesel = pesel;
        this.adresZamieszkania = adresZamieszkania;
    }
    
    
    
}

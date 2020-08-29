/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.grenczuk.javatestapp.Person;

/**
 *
 * @author andrz
 */
public class Person extends Osoba {

    @Override
    public String getImie() {
        return imie;
    }

    @Override
    public void setImie(String imie) {
        this.imie = imie;
    }

    /**
     *
     * @return
     */
    @Override
    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getNazwiskoPanienskieMatki() {
        return nazwiskoPanienskieMatki;
    }

    @Override
    public void setNazwiskoPanienskieMatki(String nazwiskoPanienskieMatki) {
        this.nazwiskoPanienskieMatki = nazwiskoPanienskieMatki;
    }

    @Override
    public String getPesel() {
        return pesel;
    }

    @Override
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String getAdresZamieszkania() {
        return adresZamieszkania;
    }

    @Override
    public void setAdresZamieszkania(String adresZamieszkania) {
        this.adresZamieszkania = adresZamieszkania;
    }

    @Override
    public char getPłeć() {
        return płeć;
    }

    @Override
    public void setPłeć(char płeć) {
        this.płeć = płeć;
    }

    @Override
    public int getWzrost() {
        return wzrost;
    }

    @Override
    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    @Override
    public double getWaga() {
        return waga;
    }

    @Override
    public void setWaga(double waga) {
        this.waga = waga;
    }

    @Override
    public String getKolorSkóry() {
        return kolorSkóry;
    }

    @Override
    public void setKolorSkóry(String kolorSkóry) {
        this.kolorSkóry = kolorSkóry;
    }

    @Override
    public String getKolorWłosów() {
        return kolorWłosów;
    }

    @Override
    public void setKolorWłosów(String kolorWłosów) {
        this.kolorWłosów = kolorWłosów;
    }

    @Override
    public String getPochodzenie() {
        return pochodzenie;
    }

    @Override
    public void setPochodzenie(String pochodzenie) {
        this.pochodzenie = pochodzenie;
    }

    public Person() {
    }

    public Person(String imie, String nazwisko, String email, String nazwiskoPanienskieMatki, String pesel, String adresZamieszkania) {
        super(imie, nazwisko, email, nazwiskoPanienskieMatki, pesel, adresZamieszkania);
    }

    /*Czlowiek czlowiek = new Czlowiek();
    Osoba osoba = new Osoba();*/

    

    
    
}

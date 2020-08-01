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
public class Czlowiek {
    char płeć;
    int wzrost;
    double waga;
    String kolorSkóry;
    String kolorWłosów;
    String pochodzenie;

    public char getPłeć() {
        return płeć;
    }

    public void setPłeć(char płeć) {
        this.płeć = płeć;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public String getKolorSkóry() {
        return kolorSkóry;
    }

    public void setKolorSkóry(String kolorSkóry) {
        this.kolorSkóry = kolorSkóry;
    }

    public String getKolorWłosów() {
        return kolorWłosów;
    }

    public void setKolorWłosów(String kolorWłosów) {
        this.kolorWłosów = kolorWłosów;
    }

    public String getPochodzenie() {
        return pochodzenie;
    }

    public void setPochodzenie(String pochodzenie) {
        this.pochodzenie = pochodzenie;
    }

    public Czlowiek() {
    }

    public Czlowiek(char płeć, int wzrost, double waga, String kolorSkóry, String kolorWłosów, String pochodzenie) {
        this.płeć = płeć;
        this.wzrost = wzrost;
        this.waga = waga;
        this.kolorSkóry = kolorSkóry;
        this.kolorWłosów = kolorWłosów;
        this.pochodzenie = pochodzenie;
    }

    /*@Override
    public String toString() {
    return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    
}

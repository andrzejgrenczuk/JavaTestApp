/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.grenczuk.javatestapp.kalkulator;

/**
 *
 * @author andrz
 */
public class CalcOPS {
    public static int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    public static double add(double num1, double num2){
        double result = num1 + num2;
        return result;
    }
    public static  int sub(int num1, int num2){
        int result = num1 - num2;
        return result;
    }
    public static  double sub(double num1, double num2){
        double result = num1 - num2;
        return result;
    }
    public static  int mul(int num1, int num2){
        int result = num1 * num2;
        return result;
    }
    public static  double mul(double num1, double num2){
        double result = num1 * num2;
        return result;
    }
    public static int div(int num1, int num2){
        if(num2 ==0){
        throw new ArithmeticException("num2 is equal to value 0");
        }else{
        int result = num1 / num2;
        return result;
        }
    }
    public static double div(double num1, double num2){
        if(num2 ==0){
        throw new ArithmeticException("num2 is equal to value 0");
        }else{
        double result = num1 / num2;
        return result;
        }
    }
    
}

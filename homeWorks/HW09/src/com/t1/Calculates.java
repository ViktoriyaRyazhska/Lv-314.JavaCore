package com.t1;

public class Calculates {

    public static double div(double a, double b) throws DivException{
        if(b == 0){
            throw new DivException("Sorry, arifmetical mistake, we can't divide to zero");
        }
        return a / b;
    }
}


package com.company;

public class CiagFibonacciego {
    public static int obliczWyrazNCiagu(int n){
        int wynik=0;
        if(n<1){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return(obliczWyrazNCiagu(n-1)+obliczWyrazNCiagu(n-2));
        }
    }
}

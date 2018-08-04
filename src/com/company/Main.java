package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int wybranyWyrazCiaguFibonacciego;
        Scanner scannerMenu = new Scanner(System.in);
        wybranyWyrazCiaguFibonacciego = scannerMenu.nextInt();
        System.out.println("Wartość "+wybranyWyrazCiaguFibonacciego+" wyrazu Ciągu Fibonacciego wynosi: "+CiagFibonacciego.obliczWyrazNCiagu(wybranyWyrazCiaguFibonacciego));

        System.out.println("SPRAWDZENIE");
        for (int i=1; i<=wybranyWyrazCiaguFibonacciego; i++){
            System.out.println("Wartość "+i+" wyrazu Ciągu Fibonacciego wynosi: "+CiagFibonacciego.obliczWyrazNCiagu(i));
        }
    }
}

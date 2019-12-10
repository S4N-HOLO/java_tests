package com.company;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        int number;
        Scanner numeric = new Scanner(System.in);
        System.out.println("ВВеди число: ( не 100)");
        number = numeric.nextInt();
        if (number == 100)
        {
            System.out.println("отсоси чмошник");
        }
    }
}

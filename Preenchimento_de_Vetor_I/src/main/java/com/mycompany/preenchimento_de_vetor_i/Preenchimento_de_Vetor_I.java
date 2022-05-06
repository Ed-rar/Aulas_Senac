package com.mycompany.preenchimento_de_vetor_i;

import java.util.Scanner;

public class Preenchimento_de_Vetor_I {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] N = new int[10];

        int num = input.nextInt();

        if (num <= 50) {
            N[0] = num;
            System.out.println("N[0] = " + N[0]);

            for (int i = 1; i < N.length; i++) {
                N[i] = N[i - 1] * 2;
                System.out.println("N[" + i + "] = " + N[i]);
            }
        }
        input.close();

    }
}

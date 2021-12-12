package com.letscode.basic_java.array_and_loops.stat_calculator;

import java.util.Scanner;

public class StatCalculator {
    public static void main(String[] args) {
        float sumNumbers = 0;
        float maxNumber = 0;
        float minNumber = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 números:");

        for(int i=0; i<5; i++) {
            float number = scanner.nextFloat();
            sumNumbers += number;

            if (i==0){
                maxNumber = minNumber = number;
            }else{
                maxNumber = Math.max(maxNumber, number);
                minNumber = Math.min(minNumber, number);
            }

        }
        scanner.close();

        System.out.printf("Maior valor: %f \n", maxNumber);
        System.out.printf("Menor valor: %f \n", minNumber);
        System.out.printf("Média: %f \n", sumNumbers/5);
    }
}

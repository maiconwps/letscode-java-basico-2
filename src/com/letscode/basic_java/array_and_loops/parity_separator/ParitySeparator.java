package com.letscode.basic_java.array_and_loops.parity_separator;

import java.util.Scanner;

public class ParitySeparator {
    public static void main(String[] args) {
        int numbers[] = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 números inteiros:");

        for(int i=0; i<numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.print("Números ímpares: ");
        for(int number: numbers) {
           if (number%2 == 1){
               System.out.printf("%d ",number);
           }
        }

        System.out.print("\nNúmeros pares: ");
        for(int number: numbers) {
            if (number%2 == 0){
                System.out.printf("%d ",number);
            }
        }
    }
}

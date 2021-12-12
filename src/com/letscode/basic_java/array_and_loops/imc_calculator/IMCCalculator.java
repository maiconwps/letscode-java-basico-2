package com.letscode.basic_java.array_and_loops.imc_calculator;

import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        String[] people = new String[5];
        boolean[] isOutIMC = new boolean[5];
        boolean isThereOutIMC = false;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5; i++) {

            System.out.printf("Digite o nome da pessoa %d: ", i+1);
            people[i] = scanner.next();

            System.out.printf("Digite a altura da pessoa %d: ", i+1);
            float personHeight = scanner.nextFloat();

            System.out.printf("Digite o peso da pessoa %d: ", i+1);
            float personWeight = scanner.nextFloat();

            float imc = (float) (personWeight/Math.pow(personHeight, 2));
            isOutIMC[i] = imc < 18.5f || imc > 25f;
            isThereOutIMC = isThereOutIMC || isOutIMC[i];
        }
        scanner.close();

        if(isThereOutIMC){
            System.out.print("Há pessoas fora do peso ideal: ");
            for(int i=0; i<5; i++){
                if (isOutIMC[i]){
                    System.out.printf("%s, ", people[i]);
                }
            }
        }else{
            System.out.println("Ninguém está fora do peso ideal!");
        }
    }
}

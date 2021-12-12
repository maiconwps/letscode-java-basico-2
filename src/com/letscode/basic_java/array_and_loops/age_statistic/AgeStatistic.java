package com.letscode.basic_java.array_and_loops.age_statistic;

import java.util.Scanner;

public class AgeStatistic {
    public static void main(String[] args) {
        String youngerPerson = "";
        String olderPerson = "";

        int youngerAge = 0;
        int olderAge = 0;
        float sumAges = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5; i++) {

            System.out.printf("Digite o nome da pessoa %d: ", i+1);
            String namePerson = scanner.next();

            System.out.printf("Digite a idade da pessoa %d: ", i+1);
            int agePerson = scanner.nextInt();

            sumAges += agePerson;

            if (i==0){
                youngerPerson = olderPerson = namePerson;
                youngerAge = olderAge = agePerson;
            }else{
                if (agePerson > olderAge){
                    olderAge = agePerson;
                    olderPerson = namePerson;
                }
                if (agePerson < youngerAge) {
                    youngerAge = agePerson;
                    youngerPerson = namePerson;
                }
            }

        }
        scanner.close();

        System.out.printf("Pessoa mais jovem: %s \n", youngerPerson);
        System.out.printf("Pessoa mais velha: %s \n", olderPerson);
        System.out.printf("Média das idades: %.2f anos", sumAges/5);
    }
}

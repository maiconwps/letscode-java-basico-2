package com.letscode.basic_java.array_and_loops.word_reverser;

import java.util.Scanner;

public class WordReverser {
    public static void main(String[] args) {
        String word;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra qualquer: ");
        word = scanner.next();
        scanner.close();

        String reversedWord = "";

        for(int i=word.length()-1; i>=0; i--){
            reversedWord += word.charAt(i);
        }

        System.out.printf("A palavra revertida é: %s", reversedWord);
    }
}

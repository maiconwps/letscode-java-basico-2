package com.letscode.basic_java.array_and_loops.text_transformer;

import java.util.Scanner;

public class TextTransformer {
    public static void main(String[] args) {
        String wordUpper;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra qualquer: ");
        wordUpper = scanner.next();
        scanner.close();

        System.out.print("A palavra transformada é: ");

        for(int i=0; i<wordUpper.length(); i++){
            char letter = wordUpper.charAt(i);
            if (i% 2 == 0) {
                System.out.print(String.valueOf(letter).toUpperCase());
            }else{
                System.out.print(letter);
            }
        }
    }
}

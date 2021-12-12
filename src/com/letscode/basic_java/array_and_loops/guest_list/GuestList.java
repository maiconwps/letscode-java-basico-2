package com.letscode.basic_java.array_and_loops.guest_list;

import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        String[] guestList = new String[5];
        String longerName = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes dos 5 convidados:");

        for(int i=0; i<5; i++) {
            guestList[i] = scanner.next();

            if (i==0){
                longerName = guestList[i];
            }else{
                longerName = guestList[i].length() > longerName.length()? guestList[i]: longerName;
            }
        }
        scanner.close();

        System.out.printf("O maior nome na lista é: %s", longerName);
    }
}

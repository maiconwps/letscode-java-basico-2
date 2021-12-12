package com.letscode.basic_java.array_and_loops.fruit_cart;

import java.util.Scanner;

public class FruitCart {
    public static void main(String[] args) {
        String[] shoppingCart = new String[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as 5 frutas para o carrinho de compras:");
        for(int i=0; i<shoppingCart.length;i++){
            shoppingCart[i] = scanner.next();
        }
        scanner.close();
        System.out.println("Sua lista de frutas é: \n"+String.join(", ", shoppingCart));
    }
}

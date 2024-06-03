package com.guilhermeporject;

import java.util.Scanner;

public class NumerosImpEPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, pos = 0, numPar = 0, impMenor = 0, impar = 0;
        char resp;
        
        do {
            System.out.print("Digite o " + (pos + 1) + "º valor: ");
            n = scanner.nextInt();
            pos++;
            
            if (n % 2 == 0) {
                numPar++;
            }
            if (n % 2 == 1) {
                impar++;
                if (impar == 1) {
                    impMenor = n;
                } else {
                    if (n < impMenor) {
                        impMenor = n;
                    }
                }
            }
            System.out.print("Quer continuar? [S/N] ");
            resp = scanner.next().charAt(0);
        } while (resp == 'S' || resp == 's');
        
        System.out.println("\nAo todo, você digitou " + pos + " valores");
        System.out.println("Você digitou " + numPar + " valores PARES");
        System.out.println("O valor " + impMenor + " foi o menor número IMPAR digitado");
        
        scanner.close();
    }
}
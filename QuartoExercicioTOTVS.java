package ExercicioTOTVS;

import java.util.Scanner;

public class QuartoExercicioTOTVS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0; // variável para somar os números
        int quantidade = 5; // quantidade de números a serem lidos

        System.out.println("Digite " + quantidade + " números inteiros:");

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / quantidade;

        System.out.println("\nA média aritmética é: " + media);

        scanner.close();
    }
}


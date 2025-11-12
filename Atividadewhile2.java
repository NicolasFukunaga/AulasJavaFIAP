package comandosrepeticao;

import java.util.Scanner;

public class Atividadewhile2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i = 1;
        int pares = 0;
        int impares = 0;

        while (i <= 10) {
            System.out.println("Digite o " + i + "° número: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            }else{
                impares++;
            }
            i++;
        }
        System.out.println(" Quantidade de números pares: " + pares);
        System.out.println(" Quantidade de números ímpares: " + impares);
    }
}

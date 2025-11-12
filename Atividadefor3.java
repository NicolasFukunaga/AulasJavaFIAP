package comandosrepeticao;

import java.util.Scanner;

public class Atividadefor3 {
    public static void main(String[] args) {

        int numero;
        int soma;

        Scanner entrada = new Scanner(System.in);

            for(int i=1; i<=5; i++){
                System.out.println("Digite o número: ");
                numero = entrada.nextInt();
                int soma += numero;
            }
    }
}

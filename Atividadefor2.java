package comandosrepeticao;
import java.util.*;
public class Atividadefor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "° número: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("\n Quantidade de números pares: " + pares);
        System.out.println("\n Quantidade de números ímpares: " + impares);
    }
}

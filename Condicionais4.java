package comandoscondicionais;

import java.util.Scanner;

public class Condicionais4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nota;
        String avaliacao;

        System.out.println("Avalie o Filme da Barbie: ");
        nota = entrada.nextInt();

        switch (nota){
            case 5: avaliacao = "Nota 5, excelente.";break;
            case 4: avaliacao = "Nota 4, ótimo.";break;
            case 3: avaliacao = "Nota 3, bom mas pode melhorar.";break;
            case 2: avaliacao = "Nota 2, não me agradou.";break;
            case 1: avaliacao = "Nota 1, ruim demais."; break;
            default: avaliacao = "Prefiro não opinar.";

        }

        System.out.println("Sua nota para o filme/série é: " + avaliacao);
    }
}

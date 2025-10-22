import java.util.Scanner;

public class SextoExercicio {
    public static void main(String[] args){;

        int num1;
        int num2;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Informe o primeiro número: ");
        num1 = entrada.nextInt();

        System.out.println("Informe o segundo número: ");
        num2 = entrada.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisão = num1 / num2;

        System.out.println("O resultado é: " + soma );
        System.out.println("O resultado é: " + subtracao);
        System.out.println("O resultado é: " + multiplicacao);
        System.out.println("O resultado é: " + divisão);
    }
}

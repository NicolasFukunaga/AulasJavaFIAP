import java.util.Scanner;

public class QuartoExercicio {
    public static void main(String [] args ){

        float peso;
        float altura;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        peso = entrada.nextFloat();

        System.out.println("Informe sua altura: ");
        altura = entrada.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc <18.5){
            System.out.println("Está muito magrinho, bora comer e treinar!");
        } else if (imc >= 18.6 && imc <= 24.9 ) {
            System.out.println("Ai sim krai, continua assim!");

        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Você está levemente acima do peso, bora controlar a boca.");

        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Você está com obesidade grau I!");

        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Você está com obesidade grau II (severa).");

        } else if (imc > 40) System.out.println("Você está com obesidade grau III (mórbida).");

    }
}

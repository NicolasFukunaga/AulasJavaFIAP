import java.util.Scanner;

public class QuintoExercicio {
    public static void main(String[] args){

        float nota1;
        float nota2;
        float nota3;
        float nota4;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Informe sua segunda nota: ");
        nota2 = entrada.nextFloat();

        System.out.println("Informe sua terceira nota: ");
        nota3 = entrada.nextFloat();

        System.out.println("Informe sua quarta nota: ");
        nota4 = entrada.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média final é de: " + media);

        if (media >= 6 ){
            System.out.println("Você foi aprovado!");

        } else if (media >= 5) {
            System.out.println("Você está de recuperação, bora correr!");

        } else {
            System.out.println("Você não passou burrinho, estude mais!");
        }
    }

}

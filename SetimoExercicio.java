import java.util.Scanner;

public class SetimoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float raio;

        System.out.println("Informe o raio do círculo: ");
        raio = entrada.nextFloat();

        float area = (raio*raio) * 3.14f;
        float perimetro = (2* 3.14f * raio);

        System.out.println("Esta é a sua área: " + area);
        System.out.println("Este é seu perimêtro: " + perimetro);

    }

}

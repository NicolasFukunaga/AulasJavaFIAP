package ExercicioTOTVS;

import java.util.Scanner;

public class TerceiroExercicioTOTVS {
    public static void main(String[] args){
        System.out.println("Digite o número:");

        int tabuada =0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a tabuada desejada: ");
        tabuada = entrada.nextInt();

        for(int n=0; n<=10; n++){
            System.out.println(tabuada + "X " + n + "=" + (tabuada*n));
        }
    }
}

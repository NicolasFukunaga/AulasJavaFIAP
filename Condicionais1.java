package comandoscondicionais;

import java.util.Scanner;

public class Condicionais1 {
    public static void main(String[] args) {



        int numero1 = 30;
        int numero2 = 15;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        numero2 = entrada.nextInt();


        if (numero1 > numero2){
            System.out.println("O número maior é: " + numero1);
        }else if(numero2 > numero1){
             System.out.println("O numero maior é: " + numero2);
        }else{
            System.out.println("Os números são iguais");
        }



    }
}


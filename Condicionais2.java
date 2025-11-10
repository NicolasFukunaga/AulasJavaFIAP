package comandoscondicionais;

import java.util.Scanner;
public class Condicionais2 {
    public static void main(String[] args) {

        int idade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com a sua idade: ");
        idade = entrada.nextInt();

        if(idade < 16){
            System.out.println("Você ainda não pode votar!");
        }else if(idade < 18){
            System.out.println("O voto é opcional.");
        }else if((idade >= 18) && (idade <= 69)){
            System.out.println("O seu voto é obrigatório!");
        }else{
            System.out.println("Seu voto é opcional.");
        }
    }
}

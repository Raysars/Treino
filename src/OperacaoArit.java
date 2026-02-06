import java.util.Scanner;

public class OperacaoArit{
    public static void main(String[] args){

        //1) Leia dois números inteiros e mostre soma, subtração, multiplicação e divisão.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num1 = teclado.nextInt();
        System.out.println("Digite um número inteiro");
        int num2 = teclado.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);









    }
}
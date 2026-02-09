import java.util.Scanner;

public class MaiorMenor {
    public static void main(String args[]){
        //5. Leia dois números e informe se o primeiro é maior ou se são iguais.

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero1 = ler.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int numero2 = ler.nextInt();

        
        if (numero1 > numero2){
            System.out.println("O primeiro numero é maior!");
        } else if (numero1 == numero2) {
            System.out.println("Os dois números são iguais!");
        }  else {
            System.out.println("O primero número é menor e os números digitados não são iguais!");
        }

    }
}

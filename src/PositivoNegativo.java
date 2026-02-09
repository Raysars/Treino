import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args){
        // 4. Leia um número inteiro e informe se é positivo, negativo ou zero.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro podendo ser negativo ou positivo: ");
        int num = teclado.nextInt();

        if (num > 0) {
            System.out.println("Esse é um número negativo!");
        } else if (num < 0) {
            System.out.println("Esse é um número positivo!");
        } else {
            System.out.println("Esse é o número 0.");
        }

    }
}

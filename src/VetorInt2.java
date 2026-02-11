import java.util.ArrayList;
import java.util.Scanner;

public class VetorInt2 {
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        int tamanho = num.nextInt();
        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++ ) {
            int numero = 0;
            System.out.println("Digite um numero inteiro: ");
            numeros[i] = num.nextInt();
        }


        for (int j = 0; j < tamanho; j++ ) {

            System.out.println(numeros[j]);


        }

}}

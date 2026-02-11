import java.util.ArrayList;
import java.util.Scanner;

public class VetorInt {
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);

        int[] numeros = new int[5];

        ArrayList<Integer> numInt = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++ ) {
            int numero = 0;
            System.out.println("Digite um numero inteiro: ");
            numero = num.nextInt();
            numInt.add(numero);
        }


        for (int j = 0; j < 5; j++ ) {

            System.out.println(numInt.get(j));


        }

}}

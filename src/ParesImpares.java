import java.util.Scanner;

public class ParesImpares {
    public static void main(String args[]) {

        //Entrada dos numeros
        Scanner num = new Scanner(System.in);

        int [] numeros = new int[10];
        int [] pares = new int [10];
        int [] impares = new int [10];
        int nume = 0;
        int numero = 0;
        int qtdPar, qtdImpar;

        //Recebe os numeros e coloca no vetor
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um número inteiro: ");
            numero = num.nextInt();
            numeros[i] = numero;
        }


        qtdImpar = qtdPar = 0;
        for(int i = 0; i < 10; i++) {
            nume = numeros[i];

            //verifica se o numero que entrou é par
            if (nume % 2 == 0) {
                qtdPar++;
                //verifica se o numero que entrou é impar
            } else {
                qtdImpar = qtdImpar + 1;
            }
        }

        System.out.println("Pares = " + qtdPar + " Impares = " + qtdImpar);



}}

import java.util.Scanner;

public class MaiorMenor6 {

    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);
        int [] vetorDeNumeros = new int [6];
        int numMaior = 0;
        int numMenor = 0;
        int indexMaior = 0;
        int indexMenor = 0;

        for (int i = 0; i < vetorDeNumeros.length; i++){
            System.out.println("Digite um numero inteiro: ");
            vetorDeNumeros[i] = scanner.nextInt();
        }

        numMenor = numMaior = vetorDeNumeros[0];

        for (int j=0 ; j < vetorDeNumeros.length; j++){
            if(vetorDeNumeros[j] > numMaior) {
                numMaior= vetorDeNumeros[j];
                indexMaior = j;

            } if (vetorDeNumeros[j] < numMenor) {
                numMenor= vetorDeNumeros[j];
                indexMenor = j;
            }
        }

        System.out.println("Esse é o numero maior: " + numMaior + ", que esta no index: " + indexMaior + "!");
        System.out.println("Esse é o numero menor: " + numMenor + ", que esta no index: " + indexMenor + "!");
    }
}

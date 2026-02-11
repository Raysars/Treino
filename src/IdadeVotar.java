import java.util.Scanner;

public class IdadeVotar {
    public static void main(String args[]) {
        //6. Leia a idade e informe se a pessoa pode votar

        Scanner idade = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade1 = idade.nextInt();


        boolean idadeEhMenorQue16 = idade1 < 16;
        boolean idadeEhMaiorQue16Menos18 = idade1 >= 16 && idade1 < 18;
        boolean idadeEhMaior65 = idade1 > 65;

        /**while (idadeEhMenorQue16) {
            idadeEhMenorQue16 = idade1 < 16;
            System.out.println(idade1);
            idade1++;
        }**/

        /**for(int contador = 0; contador < idade1; contador++) {
            System.out.println(contador);
        }**/

        if (idadeEhMenorQue16) {
            System.out.println("Voce não pode votar!");
        }
        else if (idadeEhMaiorQue16Menos18 || idadeEhMaior65) {
            System.out.println("Seu voto é opcional! ");
        } else {
            System.out.println("Voto obrigatório!");
        }


    }
}

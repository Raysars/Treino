import java.util.Scanner;

public class NotaAluno {
    public static void main (String args []) {

        Scanner pauta = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double nota = pauta.nextDouble();

        if (nota >= 7 && nota < 10)  {
            System.out.println("Você esta APROVADO!");
        } else if ((nota >= 5) && (nota < 7 )) {
            System.out.println("Você esta de RECUPERAÇÃO");
        } else if (nota < 5 && nota >= 0) {
            System.out.println("Você esta REPROVADO!");
        } else {
            System.out.println("Nota invalida!");
        }

    }
}

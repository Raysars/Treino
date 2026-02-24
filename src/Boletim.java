import java.util.Scanner;

public class Boletim {
    public static void main(String args[]) {
        int [][] boletim = notasAlunos(3,4);
        mostrarNotasAlunos(boletim);
    }

    public static int[][] notasAlunos (int aluno, int nota) {
        Scanner scanner = new Scanner(System.in);
        int [][] matrizBoletim = new int[aluno][nota];
        int notas = 0;

        for (aluno = 0; aluno < matrizBoletim.length; aluno++ ) {
            for (nota = 0; nota < matrizBoletim[aluno].length; nota++) {
                System.out.println("Digite um número inteiro: ");
                notas = scanner.nextInt();
                matrizBoletim [aluno][nota] = notas;
            }
        }

        return matrizBoletim;

    }

    public static void mostrarNotasAlunos (int [][] boletim){

        //aux é uma variável auxiliar para usar variável dentro for é bom especificar que é uma variável auxiliar
        //É bom especificar o contador como um index para a lógica do programa



        int auxSoma = 0;
        double media = 0;
        for (int indexAluno=0; indexAluno < boletim.length; indexAluno++){

            System.out.printf("Aluno: %d%n", indexAluno + 1);

            //tem que zerar a variável soma para poder contar a média do próximo aluno
            auxSoma = 0;
            for ( int indexNota=0; indexNota < boletim[indexAluno].length; indexNota++) {
                System.out.printf("%-4d", boletim[indexAluno][indexNota]);

                auxSoma += boletim[indexAluno][indexNota];

            }

            media = auxSoma / (double) boletim[indexAluno].length;

            System.out.printf("Média igual: %.2f%n", media);
            System.out.println(estaAprovado(media));
        }


    }

    public static String estaAprovado (double nota){

        if (nota >= 7 && nota < 10)  {
            return "Aprovado";

        } else if ((nota >= 5) && (nota < 7 )) {
            return "Recuperação";

        } else if (nota < 5 && nota >= 0) {
            return "Reprovado";

        } else {
            return "Nota Inválida!";
        }

    }
}

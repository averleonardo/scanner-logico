package boletimEscolar;

import java.util.Scanner;

public class BoletimEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer notaMinima = 70;
        // Utilizei a constante notaMinima no if-else

        System.out.println("Digite a sua nota: ");
        int nota = scanner.nextInt();

        if (nota >= notaMinima){
            System.out.println("Aprovado! " + nota + " É acima da média!");
        } else {
            System.out.println("Reprovado! " + nota + " é menor que a média!");
        }
    }

}

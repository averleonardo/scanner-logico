package tipoLogico;

import java.util.Scanner;

public class TipoLogico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Boolean verdade = true;
        // Boolean Falso = false;

        // System.out.println("Você pode jogar Madison: " + verdade);
        // System.out.println("Você não pode jogar Madison: " + Falso);

        System.out.println("Digite sua idade: ");
        int digiteSuaIdade = scanner.nextInt();

        boolean podeJogarMadison = digiteSuaIdade >= 18;
        boolean naoPodeJogarMadison = digiteSuaIdade <= 17;

        if (podeJogarMadison){
            System.out.println("Você pode jogar Madison! ");
        } else if (naoPodeJogarMadison) { System.out.println("Você não pode jogar Madison! ");

        }

    }

}
package calculadoraSimples;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Para criar uma calculadora simples você vai precisar receber três informações pelo console. São os dois números que participarão da operação e também a operação que será realizada.
        // Você vai receber o primeiro número, depois vai receber qual é a operação e, por último, o segundo número.
        // Para os números que você vai receber pelo console, pode utilizar a mesma funcionalidade que já utilizamos aqui no curso - o *Scanner*. Para receber a operação você pode receber
        // também um número que vai indicar a mesma. Por exemplo, o número 1 será adição, o 2 subtração, o 3 multiplicação e o 4 divisão.
        // Com esses três valores - os dois números e qual será a operação - você pode utilizar a estrutura de decisão if para só realizar a operação que o usuário escolheu.

        Integer adicao = 1;
        Integer subtracao = 2;
        Integer multiplicacao = 3;
        Integer divisao = 4;

        System.out.print("Digite o 1º número: ");
        Double primeiroNumero = scanner.nextDouble();

        System.out.print("Digite qual será a operação (1 para +, 2 para -, 3 para *, e 4 para /: ");
        Integer operacao = scanner.nextInt();

        System.out.print("Digite o 2º número: ");
        Double segundoNumero = scanner.nextDouble();

        // Lógica para as operações
        if (operacao == adicao){
            System.out.println("Seu resultado é: " + (primeiroNumero + segundoNumero));
        } if (operacao == subtracao){
            System.out.println("Seu resultado é: " + (primeiroNumero - segundoNumero));
        } if (operacao == multiplicacao){
            System.out.println("Seu resultado é " + (primeiroNumero * segundoNumero));
        } if (operacao == divisao){
            System.out.println("Seu resultado é " + (primeiroNumero / segundoNumero));
        }

    }
}

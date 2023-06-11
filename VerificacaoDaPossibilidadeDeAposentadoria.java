package verificacaoDaPossibilidadeDeAposentadoria;

import java.util.Scanner;

public class VerificacaoDaPossibilidadeDeAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu
        // com a previdência, depois verifique se ela pode aposentar ou não.
        // Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo
        // menos, 25 anos. Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.

        System.out.print("Digite a sua idade: ");
        Integer idadeDaPessoa = scanner.nextInt();

        System.out.print("Quantos anos você contribuiu com a previdência: ");
        Integer tempoDeContribuicao = scanner.nextInt();

        // Integer idadeMinima = 55;
        // Integer contribuicaoMinima = 25;

        if (idadeDaPessoa >= 55 && tempoDeContribuicao >= 25 ) {
            System.out.println("Você pode se aposentar!: ");
        } else {
            System.out.println("Você não pode se aposentar! ");
        }

    }

}

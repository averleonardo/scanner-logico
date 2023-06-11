package contasDoMes;

import java.util.Scanner;

public class ContasDoMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Faça um programa que receba:
        //O valor da conta de luz
        //Conta de água
        //Conta de telefone
        //Escola do filho
        //Fatura do cartão
        //Gastos com supermercado
        //... e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=".


        System.out.print("Digite o valor da conta de luz: ");
        Double contaDeLuz = scanner.nextDouble();

        System.out.print("Digite o valor da conta de água: ");
        Double contaDeAgua = scanner.nextDouble();

        System.out.print("Digite o valor da conta de telefone: ");
        Double contaDeTelefone = scanner.nextDouble();

        System.out.print("Digite o valor da conta da escola do filho: ");
        Double contaDaEscolaDoFilho = scanner.nextDouble();

        System.out.print("Digite o valor da conta do Supermercado: ");
        Double contaDoSupermercado = scanner.nextDouble();

        System.out.print("Digite o valor da fatura do cartão: ");
        Double faturaDoCartao = scanner.nextDouble();

        Double GASTO_TOTAL = contaDeLuz += contaDeAgua += contaDeTelefone += contaDaEscolaDoFilho += contaDaEscolaDoFilho += contaDoSupermercado += faturaDoCartao;

        System.out.print("Seu gasto total é de: " + GASTO_TOTAL);
    }
}

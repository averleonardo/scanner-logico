package lojaRemota;

import java.util.Scanner;

public class LojaRemota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crie um programa que receba o valor de um produto e exiba o valor final da compra.
        // Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00.
        // Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
        // Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.

        System.out.print("Qual é o valor do seu produto? ");
        Double valorDoProduto = scanner.nextDouble();

        Double valorDoFrete = 15.00;
        Double valorFinal = valorDoProduto + valorDoFrete;

        if (valorDoProduto >= 100){
            System.out.println("Valor total da compra é de: " + valorDoProduto);
        } else {
            System.out.println("Valor total da compra é de: " + (valorDoProduto + valorDoFrete));
        }
    }
}

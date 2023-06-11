package valorTotal;

import java.util.Scanner;

public class ValorTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja. Com
        // essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.
        // Depois você vai precisar usar uma estrutura de decisão. Se a quantidade desejada do produto for maior que 10
        // unidades, vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10,
        // você NÃO aplica desconto algum.
        // Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade)
        // você multiplica o subtotal pelo próprio percentual e divide tudo por 100.
        // Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal. O que sobrar
        // será o valor total final e deverá ser apresentado no console.

        System.out.print("Digite o valor do produto: ");
        Double valorDoProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        int quantidadedoProduto = scanner.nextInt();

        Double subtotal = valorDoProduto * quantidadedoProduto;
        Double desconto = 10.0 ;
        Double valorTotal = 0.0;
        Double valorTotalDesconto = 0.0;

        if (quantidadedoProduto >= 10) {
            valorTotalDesconto = subtotal * (desconto / 100);
            // valorTotalDesconto = valorTotalDesconto * quantidadedoProduto;
            valorTotal = subtotal - valorTotalDesconto;
        } else {
            valorTotal = subtotal;
        }
        System.out.println("Seu valor total é de: " + valorTotal);
    }
}

package anualBonus;

import java.util.Scanner;

public class AnualBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pense em uma empresa fictícia que todo o mês de Janeiro premia seus funcionários com um bônus, caso a meta seja alcançada.
        //
        // Crie um programa que receba 3 parâmetros. O primeiro será a meta de faturamento anual da empresa para o ano que passou.
        // Depois, receba o parâmetro referente ao faturamento real da empresa no ultimo ano. Por último, receba a média salarial
        // do funcionário(a) para o ano anterior (não precisa fazer cálculo de média salarial, já que estamos trabalhando com um
        // algoritmo fictício - na hora de informar esse parâmetro, invente um valor qualquer para representar essa média salarial).
        //
        // Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta de faturamento anual, então os funcionários
        // ganharam um bônus que será igual a média salarial deles no último ano. Caso o faturamento seja menor que a meta, mas,
        // seja maior ou igual a 80% do valor da meta, então eles receberão também 80% de sua média salarial.
        //
        // No final, mostre de quanto será o prêmio desse funcionário(a).

        Double meteFaturamentoAnual = 200000.00;
        Double porcentoDaMediaSalarial = 0.8;

        System.out.print("Digite o faturamento real da empresa no último ano: ");
        Double faturamentoReal = scanner.nextDouble();

        System.out.print("Digite sua média salarial do último ano: ");
        Double mediaSalarial = scanner.nextDouble();

        if (faturamentoReal >= meteFaturamentoAnual){
            System.out.println("Parabéns, você recebeu um bônus de " + mediaSalarial + "R$!");
        } else if (faturamentoReal >= porcentoDaMediaSalarial * mediaSalarial) {
            System.out.println("Parabéns, você recebeu um bônus de " + (porcentoDaMediaSalarial * mediaSalarial) + "R$!");
        }
    }
}

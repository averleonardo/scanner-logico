package calcularMassaCorporal;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerCalcularMassaCorporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        Double pesoDaPessoa = scanner.nextDouble();

        System.out.println("Digite a sua altura: ");
        Double alturaDaPessoa = scanner.nextDouble();

        System.out.println("Seu IMC é:" + pesoDaPessoa / (alturaDaPessoa * alturaDaPessoa));
        Double imcDaPessoa = scanner.nextDouble();
    }
}
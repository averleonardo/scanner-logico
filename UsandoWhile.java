package usandoWhile;

public class UsandoWhile {
    public static void main(String[] args) {

        Integer[] listaDeNumeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

//      Primeiro teste utilizando while

        int numero = 0;
        while (numero < listaDeNumeros.length){
            numero++;
            if (numero % 3 == 0){
                System.out.println(numero);
                numero++;
            }
        }
    }
}

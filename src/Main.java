import functions.Function;

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

public class Main {
    public static void main(String[] args) {

        Function function = new Function();

        for (int index = 1; index <= 100; index++){
            if (function.multipleOfThree(index) && function.multipleOfFive(index)){
                System.out.println("fizzbuzz");
            } else if (function.multipleOfThree(index)) {
                System.out.println("fizz");
            } else if (function.multipleOfFive(index)) {
                System.out.println("buzz");
            }else {
                System.out.println("index");
            }
        }
    }
}

package trabajo.pkg1;

/**
 *
 * @author Sarango Derlys
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, mayor, menor;

        System.out.print("Ingrese el numero 1: ");
        numero = teclado.nextInt();

        mayor = numero;
        menor = numero;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = teclado.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        teclado.close();
    }
}

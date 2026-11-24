
package trabajo.pkg1;

/**
 *
 * @author Sarango Derlys
 */

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero: ");
        numero = teclado.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        teclado.close();
    }
}

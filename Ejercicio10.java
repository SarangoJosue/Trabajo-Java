
package trabajo.pkg1;

/**
 *
 * @author Sarango Derlys
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, suma = 0;
        double promedio;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = teclado.nextInt();

            suma = suma + numero;
        }

        promedio = suma / 10.0;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);

        teclado.close();
    }
}

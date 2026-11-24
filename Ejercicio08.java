
package trabajo.pkg1;

/**
 *
 * @author Sarango Derlys
 */

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String contraseña = "";

        while (!contraseña.equals("java2026")) {
            System.out.print("Ingrese la contraseña: ");
            contraseña = teclado.nextLine();
        }

        System.out.println("Acceso concedido");

        teclado.close();
    }
}

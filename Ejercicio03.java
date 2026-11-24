
package trabajo.pkg1;
/**
 *
 * @author Sarango Derlys
 */
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
    }
}

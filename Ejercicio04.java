
package trabajo.pkg1;
/**
 *
 * @author Sarango Derlys
 */
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.print("Ingrese la nota del estudiante: ");
        nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}

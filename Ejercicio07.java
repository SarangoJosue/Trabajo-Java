package trabajo.pkg1;
 /**
 *
 * @author Sarango Derlys
 */
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int cantidad = 0;
        int suma = 0;

        System.out.println("Ingrese numeros positivos.");
        System.out.println("Ingrese un negativo para terminar.");

        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();

        while (numero >= 0) {

            if (numero > 0) {
                suma = suma + numero;
                cantidad = cantidad + 1;
            }

            System.out.print("Ingrese otro numero: ");
            numero = entrada.nextInt();
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Cantidad de numeros ingresados: "
                + cantidad);
        System.out.println("Suma total: " + suma);
    }
}
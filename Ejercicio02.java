package trabajo.pkg1;
/**
 *
 * @author Sarango Derlys
 */
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;

        System.out.print("Ingrese el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        numero2 = entrada.nextInt();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);

        if (numero2 != 0) {
            System.out.println("Division: " +
                    (double) numero1 / numero2);
            System.out.println("Residuo: " +
                    numero1 % numero2);
        } else {
            System.out.println("No se puede dividir para cero.");
            System.out.println("No se puede calcular el residuo.");
        }
    }
}

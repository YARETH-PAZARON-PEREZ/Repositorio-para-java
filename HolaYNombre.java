/* Practica Guiada 2. Transcribir la practica leer un nombre y mostrarlo
en pantalla con un mensaje.
Nombre: Pazaron Perez Yareth No.Control: 23580036 Tics
14/10/2023 */

package holaynombre;
import java.util.Scanner;

public class HolaYNombre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola "+nombre+" es un gusto conocerte");
    }
}

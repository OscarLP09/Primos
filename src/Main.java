import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Primos {
    public Main(int inicio, int fin) {
        super(inicio, fin);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            try {
                System.out.print("Introduce el número inicial: ");
                int inicio = scanner.nextInt();
                System.out.print("Introduce el número final: ");
                int fin = scanner.nextInt();

                if (inicio > fin) {
                    System.out.println("El número inicial debe ser menor o igual al número final.");
                } else {
                    // Obtener la lista de números primos en el rango
                    ArrayList<Integer> primos = buscarPrimos(inicio, fin);

                    // Mostrar los números primos
                    System.out.println("Números primos en el rango [" + inicio + ", " + fin + "]: " + primos);

                    // Mostrar la cantidad de números primos encontrados
                    int contadorPrimos = primos.size();
                    System.out.println("Cantidad de números primos encontrados: " + contadorPrimos);
                }

                // Pedir al usuario que ingrese un número para salir
                System.out.print("Introduce un número para salir del programa (o 0 para repetir): ");
                int salida = scanner.nextInt();

                if (salida != 0) { // Si el usuario ingresa un número distinto de 0, salir
                    salir = true;
                }

            } catch (Exception e) {
                System.out.println("Por favor, introduce números enteros válidos.");
                scanner.next(); // Limpiar el buffer del scanner para evitar errores
            }
        }

        System.out.println("¡Programa finalizado!");
        scanner.close();
    }
}
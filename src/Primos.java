import java.util.ArrayList;

public class Primos {

    public Primos(int inicio, int fin) {
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para buscar todos los números primos en un rango
    public static ArrayList<Integer> buscarPrimos(int inicio, int fin) {
        ArrayList<Integer> primos = new ArrayList<>();
        for (int num = inicio; num <= fin; num++) {
            if (esPrimo(num)) {
                primos.add(num);
            }
        }
        return primos;
    }
}

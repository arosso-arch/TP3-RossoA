package resol.RossoA;

import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá 10 números enteros: ");
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        promedioNumerosPrimos(numeros); 
        scanner.close();
    }

    private static boolean esPrimo(int n) {
        if (n <= 1) {
            System.out.println(n + " no es un número primo.");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " no es un número primo.");
                return false;
            }
        }
        System.out.println(n + " es un número primo.");
        return true;
    }

    private static void promedioNumerosPrimos(int[] numeros) {
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            if (esPrimo(num)) {
                suma += num;
                contador++;
            }
        }
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de los números primos es: " + promedio);
        } else {
            System.out.println("No se ingresaron números primos.");
        }
    }
}
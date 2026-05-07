package resol.RossoA;

import java.util.Scanner;

public class Ejercicio5 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo:");
        int numero = scanner.nextInt();

        while (numero <= 0 ) {
            System.out.println("El número es invalido. Por favor, ingrese un número entero positivo:");
            numero = scanner.nextInt();
        };

        String binario = convertirABinario(numero);
        System.out.println("El número " + numero + " en binario es: " + binario);
        scanner.close();
    }

    private static String convertirABinario(int numero) {
        String binario = "";
        int cociente = numero;

        do {
            int residuo = cociente % 2;
            binario = residuo + binario;
            cociente = cociente / 2;

        } while (cociente > 0);

        return binario;
    }
}
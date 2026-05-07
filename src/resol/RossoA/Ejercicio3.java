package resol.RossoA;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá una cadena de texto: ");
        String texto = scanner.nextLine();

        System.out.print("Ingresa el caracter a buscar: ");
        char caracter = scanner.next().toLowerCase().charAt(0);

        ArrayList<Integer> posiciones = analizarCaracter(texto, caracter);

        if (posiciones.isEmpty()) {
            System.out.println("El carácter '" + caracter + "' no se encontró.");
        } else {
            System.out.println("El carácter '" + caracter + "' se encontró en las posiciones: " + posiciones);
            System.out.println("Porcentaje de apariciones: " + String.format("%.2f", porcentajeApariciones(posiciones.size(), texto.length())) + "%");
        }

        scanner.close();
    }

    private static ArrayList<Integer> analizarCaracter(String texto, char caracter) {
        ArrayList<Integer> posiciones = new ArrayList<>();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.toLowerCase().charAt(i) == caracter) {
                posiciones.add(i);
            }
        }
        
        return posiciones;
    }

    private static double porcentajeApariciones(int totalPosiciones, int longitudTexto) {
        if (longitudTexto == 0) {
            return 0.0;
        }
        return (double) totalPosiciones * 100 / longitudTexto;
    }
}
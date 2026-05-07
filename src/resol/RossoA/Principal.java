package resol.RossoA;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("Seleccione el ejercicio a ejecutar (1 - 6):");
        Scanner scanner = new Scanner(System.in);
        int ejercicio = scanner.nextInt();

        switch (ejercicio) {
            case 1:
                Ejercicio1.ejecutar();
                break;
            case 2:
                Ejercicio2.ejecutar();
                break;
            case 3:
                Ejercicio3.ejecutar();
                break;
            case 4:
                Ejercicio4.ejecutar();
                break;
            case 5:
                Ejercicio5.ejecutar();
                break;
            case 6:
                Ejercicio6.ejecutar();
                break;
            default:
                System.out.println("Ejercicio no válido. Por favor, seleccione un número entre 1 y 6.");
        }

        scanner.close();
    }
}

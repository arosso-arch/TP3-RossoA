package resol.RossoA;

import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de n y columnas de tu matriz cuadrada: ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                int random = (int) (Math.random() * 100);
                matriz[f][c] = random;
            }
        }

        System.out.println("Matriz generada:");
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }

        compararSumasDiagonales(matriz);

        scanner.close();
    }

    private static int sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        System.out.println("La suma de la diagonal principal es: " + suma);
        return suma;
    }

    private static int sumarDiagonalSecundaria(int[][] matriz) {
        int suma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }
        System.out.println("La suma de la diagonal secundaria es: " + suma);
        return suma;
    }
   
   private static void compararSumasDiagonales(int[][] matriz) {
        int sumaP = sumarDiagonalPrincipal(matriz);
        int sumaS = sumarDiagonalSecundaria(matriz);

        System.out.println("Suma Diagonal Principal: " + sumaP);
        System.out.println("Suma Diagonal Secundaria: " + sumaS);

        int mayor = Math.max(sumaP, sumaS);

        if (sumaP == sumaS) {
            System.out.println("Ambas diagonales suman lo mismo: " + mayor);
        } else if (sumaP > sumaS) {
            System.out.println("Principal es la suma mayor: " + mayor);
        } else {
            System.out.println("Secundaria es la suma mayor: " + mayor);
        }
    }
}
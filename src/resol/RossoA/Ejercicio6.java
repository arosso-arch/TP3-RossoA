package resol.RossoA;

import java.util.Scanner;

public class Ejercicio6 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra sin espacios, números o caracteres especiales:");
        String input = scanner.nextLine();

        while (!input.matches("[a-zA-Z]+")) {
            System.out.println("La palabra es invalida. Por favor, ingrese una palabra sin espacios, números o caracteres especiales:");
            input = scanner.nextLine();
        }

        System.out.println("Ingrese un valor de desplazamiento");
        int valor = scanner.nextInt();
      
        System.out.println("La nueva palabra es: " + sumarPosicionesEnAbecedario(input, valor));
        scanner.close();
    }

    private static String sumarPosicionesEnAbecedario(String input, int valor) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if(valor > 26){
                valor = valor % 26;
        }

        String nuevaPalabra = "";

        for(int i = 0; i < input.length(); i++){
            char letra = input.charAt(i);
            int posicion = abc.indexOf(Character.toUpperCase(letra));
            int nuevaPosicion = (posicion + valor) % 26;
            nuevaPalabra += abc.charAt(nuevaPosicion);
        }
        
       
        return nuevaPalabra;
    }
}
package resol.RossoA;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio4 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha (YYYY-MM-DD): ");
        String fechaStr = scanner.nextLine();
        LocalDate fecha = LocalDate.parse(fechaStr);

        System.out.print("Ingrese otra fecha (YYYY-MM-DD): ");
        String fecha2Str = scanner.nextLine();
        LocalDate fecha2 = LocalDate.parse(fecha2Str);

        do{
            System.out.println("La segunda fecha debe ser posterior a la primera. Intente nuevamente.");
            System.out.print("Ingrese otra fecha (YYYY-MM-DD): ");
            fecha2Str = scanner.nextLine();
            fecha2 = LocalDate.parse(fecha2Str); 
        }   while (fecha2.isBefore(fecha));

        long diferenciaDias = ChronoUnit.DAYS.between(fecha, fecha2);
        System.out.println("La diferencia en días es: " + diferenciaDias);

        scanner.close();
    }
}
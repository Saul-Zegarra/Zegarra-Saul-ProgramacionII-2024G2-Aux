package ejercicio1;

import java.util.Scanner;

public class FormateadorFechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una fecha (por ejemplo, 4 de junio, 2004): ");
        String fecha = scanner.nextLine();

        String[] partesFecha = fecha.split(" ");
        if (partesFecha.length != 3) {
            System.out.println("La fecha ingresada no tiene el formato correcto.");
            return;
        }

        int dia = Integer.parseInt(partesFecha[0].replaceAll("[^0-9]", ""));
        String mesStr = partesFecha[1];
        int año = Integer.parseInt(partesFecha[2]);

        int mes = obtenerNumeroMes(mesStr);
        if (mes == -1) {
            System.out.println("Mes inválido.");
            return;
        }

        if (!esFechaValida(dia, mes, año)) {
            System.out.println("Fecha inválida.");
            return;
        }

        String fechaFormateada = String.format("%d/%02d/%d", dia, mes, año);
        System.out.println("Fecha formateada: " + fechaFormateada);
    }

    private static int obtenerNumeroMes(String mesStr) {
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre" };
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equalsIgnoreCase(mesStr)) {
                return i + 1;
            }
        }
        return -1;
    }

    private static boolean esFechaValida(int dia, int mes, int año) {
        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (esBisiesto(año)) {
            diasPorMes[1] = 29;
        }
        return dia >= 1 && dia <= diasPorMes[mes - 1];
    }

    private static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || año % 400 == 0;
    }
}
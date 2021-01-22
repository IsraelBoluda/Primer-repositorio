import java.util.Scanner;

public class Ej5T2 {
    public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float pesocuestionario;
		float pesoactividad;
		
		String CompruebaError;
		
		float notacuestionario;
		float notaactividad;
		
		float nota0a10;
		float nota10a50;
		float total50;
		
		
		System.out.println("Dime el peso del cuestionario (0.0-1.0)");
		pesocuestionario = teclado.nextFloat();
		System.out.println("Dime el peso de la actividad (0.0-1.0)");
		pesoactividad = teclado.nextFloat();
		
		CompruebaError = ((pesocuestionario + pesoactividad) != 1.0 || pesocuestionario < 0 || pesocuestionario > 1 || pesoactividad < 0 || pesoactividad > 1) ? "ERROR DE DATOS": "";
		System.out.println(CompruebaError);
		
		System.out.println("Nota del cuestionario [0-10]");
		notacuestionario = teclado.nextFloat();
		System.out.println("Nota de la actividad [0-10]");
		notaactividad = teclado.nextFloat();
		
		nota0a10 = (notacuestionario * pesocuestionario + notaactividad * pesoactividad);
		System.out.printf("Nota en [0, 10] es %1.2f \n", nota0a10);
		
		total50 = 10 + (nota0a10/10) * (40);
		System.out.printf("Nota en [10, 50] es %1.2f ", total50);
	}
}
package procesos.ejerciciosTema2;


	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;
	public class Ejercicio2 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce una frase para analizar.");
			String frase=sc.nextLine();
			String [] palabras=frase.split(" ");
			String nombreClase = "procesos.ejerciciosTema2.Ejercicio2.Analizador";
			String ruta="C:\\Users\\Idoia\\eclipse-workspace\\Psp\\bin";
			for(int i=0; i<palabras.length;i++) {
				String salida="C:\\Users\\Idoia\\eclipse-workspace\\Psp\\src\\procesos\\ejerciciosTema2"
						+ "\\Ejercicio_" + palabras[i] + ".txt";
				String errores="C:\\Users\\Idoia\\eclipse-workspace\\Psp\\src\\procesos\\ejerciciosTema2"
						+ "\\error_" + ".txt";
				
				ProcessBuilder pb= new ProcessBuilder("java", nombreClase, palabras[i]);
				pb.redirectError(new File(errores));
				pb.redirectOutput(new File(salida));
				pb.directory(new File (ruta));
				try {
					pb.start();
				} catch (IOException e) {
					System.out.println("Error al lanzar el proceso");
				}
			}
}
	}
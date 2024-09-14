package procesos.ejerciciosTema1;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		//El nombre de la clase tb tiene el nombre del paquete
		String nombreClase="procesos.ejerciciosTema1.Ejercicio1.Intervalo";
		//Pondremos la ruta desde la que se ejecutará la clase. 
		//Siempre será la carpeta BIN
		String ruta="C:\\Users\\Idoia\\eclipse-workspace\\Psp\\bin";
		Scanner sc= new Scanner(System.in);
		boolean salir = false;
		while(!salir) {
			System.out.println("¿Cuál es el primer numero?");
			int num1=sc.nextInt();
			if(num1!=0) {
					System.out.println("¿Cuál es el segundo numero?");
					int num2=sc.nextInt();
					//Redirijo la salida a un archivo de texto
					String salida="C:\\Users\\Idoia\\eclipse-workspace\\Psp\\src\\procesos\\ejerciciosTema1"
							+ "\\Ejercicio " + num1  + "-" + num2 + ".txt";
					//Redirijo la salida a un archivo de texto
					String errores="C:\\Users\\Idoia\\eclipse-workspace\\Psp\\src\\procesos\\ejerciciosTema1"
							+ "\\errores" + num1  + "_" + num2 +".txt";
					//Lanzo el programa "java" y le paso el nombre de la clase como argumento
					ProcessBuilder pb= new ProcessBuilder("java", nombreClase, 
							String.valueOf(num1), String.valueOf(num2));
					pb.redirectOutput(new File(salida));
					pb.redirectError(new File(errores));
					//Indico desde qué carpeta debe lanzar el proceso
					pb.directory(new File(ruta));
					try {
						pb.start();
					} catch (IOException e) {
						e.printStackTrace();
						System.err.println("Error al abrir el archivo.");
					}
				
			}else {
				salir=true;
			}
		}
	}

}

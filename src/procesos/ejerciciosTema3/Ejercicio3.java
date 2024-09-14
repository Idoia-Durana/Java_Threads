package procesos.ejerciciosTema3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int numProcesos=4;
		//El nombre de la clase tb tiene el nombre del paquete
		String nombreClase="procesos.ejerciciosTema3.Ejercicio3.Sumatorio";
		//Pondremos la ruta desde la que se ejecutar� la clase. 
		//Siempre ser� la carpeta BIN
		String ruta="C:\\Users\\Idoia\\eclipse-workspace\\Psp\\bin";
		Scanner sc= new Scanner(System.in);
		boolean salir = false;
		System.out.println("Introduce un numero: ");
		int numero=sc.nextInt();
		System.out.println("Introduce otro número: ");
		int numero2= sc.nextInt();
		
		
		int inicio=0, fin=0, intervalo=numero/numProcesos, resto=numero%numProcesos;
		int num1=0, num2=inicio-1;
		long total=0;
		for(int i=0;i<numProcesos;i++) {
			num1=num2++;
			num2=num1+intervalo-1;
			if(i==numProcesos-1) {
				num2+=resto;
			}
			//Redirijo la salida a un archivo de texto
			String salida="C:\\Users\\Idoia\\eclipse-workspace\\Psp\\src\\procesos\\ejerciciosTema3"
					+ "\\Ejercicio_" +num1  + "_" + num2 + ".txt";
			//Redirijo la salida a un archivo de texto
			String errores="C:\\Users\\Idoia\\eclipse-workspace\\Psp\\src\\procesos\\ejerciciosTema3"
					+ "\\error_" +num1  + "_" + num2 + ".txt";
			//Lanzo el programa "java" y le paso el nombre de la clase como argumento
			ProcessBuilder pb= new ProcessBuilder("java", nombreClase, 
					String.valueOf(num1), String.valueOf(num2));
			pb.redirectOutput(new File(salida));
			pb.redirectError(new File(errores));
			//Indico desde qu� carpeta debe lanzar el proceso
			pb.directory(new File(ruta));
			try {
				pb.start();
				Thread.sleep(1000);
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("Error al abrir el archivo.");
			} catch (InterruptedException e) {
				System.out.println("Proceso interrumpido.");
			}
			
			try {
				FileInputStream fis = new FileInputStream(salida);
				InputStreamReader isr= new InputStreamReader(fis);
				BufferedReader br= new BufferedReader(isr); 
				while(br.ready()) {
					String linea=br.readLine();
		            long cantidad=Long.valueOf(linea);
		            total+=cantidad;
				}
				br.close();
			}catch(Exception e) {
				System.out.println("Problema al leer los archivos");
			}
		
		}
		System.out.println("El sumatorio es: " + total);
		
	}

}

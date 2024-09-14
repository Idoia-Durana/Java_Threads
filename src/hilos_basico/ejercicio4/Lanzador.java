package ejerciciosTema2.ejercicio4;

import java.util.Scanner;

public class Lanzador {
	public static void main(String[] args) {
//		Se crea un array de objetos Hilo llamado hilos con una longitud de 10.
		
		Hilo[] hilos = new Hilo[10];
		
//		Se utiliza un bucle for para iterar sobre cada elemento del array hilos.
//			Se crea un nuevo objeto Scanner para leer la entrada del usuario desde la consola. (Este escáner no parece tener ningún uso y podría ser eliminado ya que no se utiliza en el bucle).
//			Se crea un nuevo objeto Hilo con un identificador único (convertido a cadena) y se asigna a cada hilo una prioridad que es igual a su índice más uno (la prioridad se establece con el método setPriority()).
//			El hilo creado se coloca en la posición correspondiente del array hilos.		
		
		for(int i=0;i<hilos.length;i++) {
			Scanner sc= new Scanner(System.in);
			Hilo h1= new Hilo(String.valueOf(i));
			h1.setPriority(i+1);
			hilos[i]=h1;
		}
		
//		Otro bucle for se utiliza para iniciar cada hilo en el array hilos utilizando el método start(). 
//		Cada hilo comenzará su ejecución en un orden determinado por el sistema operativo y las prioridades que se han establecido.
		
		for(int i=0;i<hilos.length;i++) {
			hilos[i].start();
			
		}
	}
}

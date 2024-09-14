package ejerciciosTema2.ejercicio2;

import java.util.Scanner;

public class Lanzador {
	
//	Clase Lanzador: Esta es la clase principal que 
//	contiene el método main y se encarga de lanzar la simulación de la carrera.
	
	public static void main(String[] args) {
		
//		Se crea un array de objetos Corredor llamado corredores con una longitud de 5.
		
		Corredor[] corredores = new Corredor[5];
		
//		Se crea un objeto Tiempo, que aparentemente se utilizará 
//		para medir el tiempo de la carrera.
		
		Tiempo tiempo = new Tiempo();
		
//		Se utiliza un bucle for para iterar sobre cada elemento del array corredores.
		
		for(int i=0;i<corredores.length;i++) {
			Scanner sc= new Scanner(System.in);
			
//			Se crea un nuevo objeto Corredor con un identificador único 
//			(se asume que es la representación de cada corredor en la carrera) y el objeto Tiempo creado anteriormente.
//			Este objeto Corredor se coloca en la posición correspondiente del array corredores.
			
			Corredor c1= new Corredor(String.valueOf(i), tiempo);
			corredores[i]=c1;
		}
		
//		Otro bucle for se utiliza para iniciar cada hilo Corredor y esperar a que cada uno termine su ejecución.
//		corredores[i].start() inicia el hilo del corredor.
//		corredores[i].join() espera a que el hilo del corredor actual termine su ejecución antes de continuar con el siguiente.
//		Finalmente, se imprime el tiempo total registrado en el objeto tiempo.
		
		for(int i=0;i<corredores.length;i++) {
			corredores[i].start();
			try {
				corredores[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("El tiempo total ha sido " + tiempo.variable);
	}

}
//cuando el join se encuentra dentro del try está esperando a que termine cada hilo
//si ambos se encontrasen fuera se iniciarian todos los hilos sin esperar a que finalice
// el anterior
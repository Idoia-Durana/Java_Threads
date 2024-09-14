package hilos.ejemplo2;


import java.util.Scanner;

public class EjemploJoin {

	public static void main(String[] args) {
		//Creamos el array de corredores en el que meter los hilos que creamos
		Corredor[] corredores = new Corredor[4]; // tenemos 4 hilos de tipo corredor
		for(int i=0;i<corredores.length;i++) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Introduce el nombre del corredor  " + i + " :");
			String nombre= sc.nextLine();
			Corredor c1= new Corredor(nombre);
			corredores[i]=c1;
		}
		for(int i=0;i<corredores.length;i++) {
			corredores[i].start();
		}
		for(int i=0;i<corredores.length;i++) {
			try {
				corredores[i].join();
			} catch (InterruptedException e) {
				
			}
			
		} 
		System.out.println("Han terminado todos los corredores"); 
		
		
		// quiero esperar a esos hilos, por tanto uso la funcion .join esperando a los hilos
	}// si despues de lanzar un hilo hiciese el .join iba alanzarse el corredor1 y espera a qeu el corredor1 terminase y asi sucesivamente
//no habria lanzadao los 4 hilos a la vez, queremos lanzar 4 hilos a la vez y se queden esperando el principal a qeu termine
	//me creo un arra de corredores, les asigno sus nombres, los guardo en el array, lanzo los 4 a la vez y espero 
	//a todos a la vez
}


package hilos.ejemplo9;

public class Profesor extends Thread{
	
//	Se declaran dos variables de instancia: nombre, que almacenará el nombre del profesor,
//	y saludo, que será una instancia de la clase Bienvenida. Esto permite que el profesor
//	interactúe con la instancia de Bienvenida para saludar a los alumnos y comenzar la 
//	clase.
	
	String nombre;
	Bienvenida saludo;
	
//	Este es el constructor de la clase Profesor. Toma dos parámetros: el nombre del profesor y 
//	una instancia de Bienvenida. Estos parámetros se utilizan para inicializar las 
//	variables de instancia nombre y saludo.
	
	public Profesor(String nombre, Bienvenida bienvenida){
		this.nombre = nombre;
		this.saludo = bienvenida;
	}
	
//	Este método run() es donde ocurre la ejecución real del hilo. 
//	Cuando se inicia un hilo Profesor, este método se ejecuta en un hilo separado. 
//	En este método, primero se imprime el nombre del profesor seguido de "llegó.". 
//	Luego, el hilo se pausa durante 1000 milisegundos (1 segundo) 
//	usando Thread.sleep(1000). 
//	Después de eso, se llama al método llegadaProfesor(nombre) 
//	de la instancia de Bienvenida (pasada al constructor) para indicar que el 
//	profesor ha llegado a clase y saludar a los alumnos.
	
	
	public void run(){
		System.out.println(nombre + " lleg�.");
		try {
			Thread.sleep(1000);
			saludo.llegadaProfesor(nombre);
		} catch (InterruptedException ex) {
			System.err.println("Thread profesor interrumpido!");
			
		}
	}
}




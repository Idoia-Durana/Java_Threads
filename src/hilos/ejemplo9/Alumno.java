package hilos.ejemplo9;

public class Alumno extends Thread{
	
	//Declara una variable saludo del tipo Bienvenida. Esto indica que 
	//la clase Alumno necesita una instancia de Bienvenida para funcionar correctamente.
	
	Bienvenida saludo;
	
	//Este es el constructor de la clase Alumno. 
	//Toma un parámetro del tipo Bienvenida y lo asigna a la variable saludo.
	
	public Alumno(Bienvenida bienvenida){
		this.saludo = bienvenida;
	}
	
	//Este método run() es donde ocurre la ejecución real del hilo. Cuando se inicia un hilo Alumno, 
	//este método se ejecuta en un hilo separado. 
	//En este método, primero se imprime "Alumno llegó.". 
	//Luego, el hilo se pausa durante 1000 milisegundos (1 segundo) usando Thread.sleep(1000). 
	//Después de eso, se llama al método saludarProfesor() de la instancia de Bienvenida 
	//(pasada al constructor) para saludar al profesor.
	
	public void run(){
		System.out.println("Alumno lleg�.");
		
		try {
			Thread.sleep(1000);
			saludo.saludarProfesor();
			
			//La excepción InterruptedException se maneja aquí, lo que significa que 
			//si el hilo es interrumpido mientras está en estado de espera (sleep), 
			//se imprimirá un mensaje de error y el programa finalizará con un código de salida -1.
		
		} catch (InterruptedException ex) {
			System.err.println("Thread alumno interrumpido!");
			System.exit(-1);
		}
	}
}

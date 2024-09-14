package hilos.ejemplo9;

public class ComienzoClase {
	public static void main(String[] args) {
		
//		Aquí se crea una instancia de la clase Bienvenida llamada b. 
		//Esta instancia será compartida entre los alumnos y el profesor 
		//para coordinar su interacción.
		
		Bienvenida b = new Bienvenida();
		
//		Se declara una variable n_alumnos y se le asigna el valor de 10. 
		//Esto indica que habrá 10 alumnos en la clase.
		
		int n_alumnos = 10;
		
//		Este bucle for crea 10 instancias de la clase Alumno, pasándoles la instancia de Bienvenida 
//		como argumento al constructor. Luego, cada instancia de Alumno se inicia como un hilo 
//		independiente utilizando el método start().
		
		for (int i=0; i< n_alumnos; i++){
			new Alumno(b).start();
		}
		
//		Aquí se crea una instancia de la clase Profesor llamada profesor, 
//		pasándole el nombre del profesor y la instancia de Bienvenida como argumentos 
		//al constructor. Luego, esta instancia de Profesor también se inicia como 
//		un hilo independiente utilizando el método start().
		
		Profesor profesor = new Profesor("Osvaldo Ramirez",b);
		profesor.start();
	}
}

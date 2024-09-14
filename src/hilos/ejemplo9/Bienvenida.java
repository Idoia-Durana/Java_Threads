package hilos.ejemplo9;


public class Bienvenida {
	
	//Declara una clase llamada Bienvenida.
	//Declara una variable booleana llamada clase_comenzada, 
	//que indica si la clase ha comenzado o no.
	
	boolean clase_comenzada;
	
	//Este es el constructor de la clase Bienvenida. Inicializa
	//clase_comenzada a false, lo que significa que al principio la clase no ha comenzado.
	
	public Bienvenida(){
		this.clase_comenzada = false;
	}
	
	//Este método, saludarProfesor(), es llamado por los alumnos. 
	//Utiliza wait() para suspender la ejecución del hilo que lo llama hasta que 
	//clase_comenzada sea true. Si clase_comenzada es false, significa que 
	//el profesor aún no ha llegado y la clase no ha comenzado, por lo que el 
	//hilo se queda esperando en este estado. Una vez que clase_comenzada 
	//se establece en true (lo que sucede en el método llegadaProfesor()), 
	//todos los hilos que estaban esperando son notificados y continúan su ejecución. 
	//Entonces se imprime "Buenos días, profesor."
	
	public synchronized void saludarProfesor(){
		try {
			while (clase_comenzada == false){
				wait();
			}
			System.out.println("Buenos d�as, profesor.");
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
//	Este método, llegadaProfesor(String nombre), es llamado por el profesor cuando llega.
	//Imprime un saludo a todos los alumnos y establece clase_comenzada en true. 
	//Luego, utiliza notifyAll() para notificar a todos los hilos que están esperando 
	//en saludarProfesor() que el profesor ha llegado y la clase ha comenzado.
	
	
	public synchronized void llegadaProfesor(String nombre){
		System.out.println("Buenos d�as a todos. Soy el profesor " + nombre);
		this.clase_comenzada = true;
		notifyAll();
	}
}


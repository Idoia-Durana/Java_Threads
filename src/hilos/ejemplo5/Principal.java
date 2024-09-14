package hilos.ejemplo5;


public class Principal {

	public static void main(String[] args) {
//	Se crea un array de hilos de tamaño 10. Este array será utilizado 
//		para almacenar los hilos que se crearán más adelante.
		
		Thread[] arrayHilos= new Thread[10];
		
//		Se inicia un bucle for que se ejecutará 10 veces.
		
		for(int i=0;i<10;i++) {

//			En cada iteración del bucle se crea un nuevo objeto Thread. Se pasa un nuevo objeto Hilo como argumento al constructor de Thread.
//			Hilo es una clase que probablemente has definido en otro lugar de tu código. El índice i
//			se pasa al constructor de Hilo, probablemente para identificar cada hilo de manera única.
			
			Thread th= new Thread(new Hilo(i));

			//Se inicia el hilo creado llamando al método start(). 
//			Este método comienza la ejecución del hilo, invocando el método run()
//			del objeto Hilo.
		
			th.start();
//			Se agrega el hilo recién creado al array de hilos en la posición correspondiente.
			arrayHilos[i]=th;
		}
		try {
			
//			El hilo principal se duerme durante 5000 milisegundos (5 segundos). Esto es para permitir que los hilos secundarios ejecuten alguna tarea antes de ser interrumpidos.

			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		for(int i=0;i<arrayHilos.length;i++) {
			
//		Después de 5 segundos, se itera sobre el array de hilos y se llama al método interrupt() en cada hilo. 
//		Esto envía una señal de interrupción al hilo correspondiente,lo que podría detener su ejecución si está bloqueado esperando alguna operación.
			
			arrayHilos[i].interrupt();
		}
	}
}
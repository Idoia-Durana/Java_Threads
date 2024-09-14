package hilos.ejemplo1;

	//Para que la clase sea un hilo tiene que heredar de la clase Thread
	public class Hilo extends Thread{
		int numero;
		
		public Hilo(int numero){
			this.numero=numero;
		}
		// siempre que algo descienda de Thread vamos a tener que crear metodo run
		//El metodo run es lo que el hilo va a ejecutar
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("Hilo " + numero + " ejecutándose por " + i +" vez");
				try {
					//Simulamos que el hilo tarda 500ms
					// esto se usa para que nosotros sepamos que está funcionando porque sino va a ir muy rapido y nos vamos a enterar de lo qeu sucede 
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		//Esta clase por si sola no va a hacer nada, tenemos que crear otra clase llamada lanzador
}


package hilos;

class HelloThread implements Runnable {
	Thread t;
	HelloThread () {
	t = new Thread(this, "Nuevo Thread"); 
	System.out.println("Creado hilo: " + t);
	t.start(); // Arranca el nuevo hilo de ejecución. Ejecuta run
	}
	public void run() {
	System.out.println("Hola desde el hilo creado!"); 
	System.out.println("Hilo finalizando.");
	}
	}

class RunThread {
	public static void main(String args[]) {
	new HelloThread(); // Crea un nuevo hilo de ejecución 
	System.out.println("Hola desde el hilo principal!"); 
	System.out.println("Proceso acabando.");
	}
	}
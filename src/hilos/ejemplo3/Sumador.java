package hilos.ejemplo3;

public class Sumador extends Thread{ // cada hilo sumador hereda de thread
	Contenedor variableGlobal; //cada hilo sumador va a recibir esa variable
	
	public Sumador(Contenedor variable) {
		this.variableGlobal=variable;
	}
	
	public void run() { // cada hilo suma 10 a la variable global
		
		for(int i=0;i<10;i++) {
			variableGlobal.sumar(10); // en la variable global llama al metodo sumar
			try {
				Thread.sleep(5); // va a sumar 10 veces echandose a dormir 5 milesimas
			} catch (InterruptedException e) {
				System.out.println("Hilo interrumpido.");
			}
		}
	}
	
	
	

}
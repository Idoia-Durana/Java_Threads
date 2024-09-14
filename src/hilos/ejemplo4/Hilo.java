package hilos.ejemplo4;


//Al implementar de la interfaz Runnable podemos hacer herencia de otras clases
public class Hilo implements Runnable{
	int identificador;
	
	public Hilo(int identificador) {
		this.identificador=identificador;
	}
	
	//Al implementar la interfaz Runnable tenemos que sobreescribir el run
	public void run() {
		//Cada hilo mostrará el mensaje 10 veces, con un intervalo de 1 segundo
		for(int i=0; i<10;i++) {
			System.out.println("Hilo " + this.identificador + " ejecutándose por vez " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}	
}
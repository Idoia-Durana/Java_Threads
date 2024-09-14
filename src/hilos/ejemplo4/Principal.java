package hilos.ejemplo4;


public class Principal {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			
			Thread th= new Thread(new Hilo(i));
			th.start();
		}

	}
}


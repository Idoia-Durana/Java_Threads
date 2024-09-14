package hilos.ejemplo3;


public class Contenedor { //clase donde vamos a meter una variable y esa clase se la vamos 
	//a pasar a todos los hilos que lancemos
	int variable;
	
	//tenemos dos metodos sincronizados, lo que conseguimos es qeu solo entre un hilo a cada vez en estos metodos
	//cualquier clase en su interior contiene un semaforo, lo que va a hacer es cada vez que un hilo entre sea sólo 1
	// si entra un hilo en sumar, no va a poder entrar un hilo ni en sumar ni en restar hasta que el hilo termine
	public synchronized void sumar(int cantidad) {
		this.variable+=cantidad;
	}
	public synchronized void restar(int cantidad) {
		this.variable-=cantidad;
	}
}
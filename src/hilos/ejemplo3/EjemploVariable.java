package hilos.ejemplo3;


public class EjemploVariable {

	public static void main(String[] args) {
		Sumador[] sumador= new Sumador[10]; // array creado para cuando vengan los hilos
		Contenedor contenedor= new Contenedor(); // contenedor va a tener la variable 
		for(int i=0;i<10;i++) {
			sumador[i]= new Sumador(contenedor); // el contenedor se lo pasamos a todos los hilos
			sumador[i].start(); // la clase contenedor es la que nos va a servir para mostrar lo que han ido sumnado todos los hilos
		}
		for(int i=0;i<10;i++) {
			try {
				sumador[i].join();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("LA variable global vale: " + contenedor.variable);

	} //creo todos los hilos, los meto en el array y en el sig for hago el join a todos los hilos
}


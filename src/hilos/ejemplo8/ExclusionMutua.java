package hilos.ejemplo8;


class GlobalVar {
	public static int c1 = 0;
	public static int c2 = 0;
}

public class ExclusionMutua {

public static void main(String[] args) throws InterruptedException {
	int N = Integer.parseInt (args[0]); 
	DosMutex hilos[];
	System.out.println ("Creando " + N + " hilos");
	
	hilos= new DosMutex[N];
	for (int i= 0; i < N; i++){
		hilos[i] = new DosMutex(); 
		hilos[i].start();
	}
	for (int i= 0; i < N; i++) { 
		hilos[i].join();;
	}
	System.out.println ("C1 = " + GlobalVar.c1); 
	System.out.println ("C2 = " + GlobalVar.c2);
	}
}

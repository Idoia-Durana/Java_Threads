package procesos.ejerciciosTema1;


public class Intervalo {
//Esta clase recibirá 2 números como argumento e imprimirá por pantalla los
//numeros del menor de ellos al mayor
	public static void main(String[] args) {
		int num1= Integer.parseInt(args[0]);
		int num2= Integer.parseInt(args[1]);
		if(num1>num2) {
			int aux= num1;
			num1=num2;
			num2=aux;
		}
		for(int i=num1; i<=num2;i++) {
			System.out.print(i + ",");
		}
	}
}
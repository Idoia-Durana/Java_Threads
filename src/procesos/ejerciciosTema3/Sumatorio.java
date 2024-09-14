package procesos.ejerciciosTema3;


public class Sumatorio {
	public static void main (String[] args) {
		int num1=Integer.valueOf(args[0]);
		int num2=Integer.valueOf(args[1]);
		long sumatorio=0;
		for (int i=num1;i<=num2;i++) {
			sumatorio+=i;
		}
		System.out.println(sumatorio);
	}

}


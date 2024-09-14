package procesos.ejerciciosTema2;

public class Analizador {

	public static void main(String[] args) {
		String palabra=args[0];
		String vocales="aeiouAEIOU";
		int contadorVocales=0;
		int contadorConsonantes=0;
		int contadorMayusculas=0;
		boolean palindromo=true;
		for(int i=0;i<palabra.length();i++) {
			for(int j=0;j<vocales.length();j++) {
				if(palabra.charAt(i)==vocales.charAt(j)) {
					contadorVocales++;
				}
			}
			if((palabra.charAt(i)>=65 && palabra.charAt(i)<=90) 
					||(palabra.charAt(i)>=97 && palabra.charAt(i)<=122)) {
				if(vocales.lastIndexOf(palabra.charAt(i))==-1) {
					contadorConsonantes++;
				}
			}	
			if(palabra.charAt(i)>=65 && palabra.charAt(i)<=90){
				contadorMayusculas++;
			}
			if(palabra.charAt(i)!=palabra.charAt(palabra.length()-1-i)) {
				palindromo=false;
			}
			
		}
		System.out.println("La palabra " + palabra + " tiene " + contadorVocales + " vocales.");
		System.out.println("La palabra " + palabra + " tiene " + contadorConsonantes + " consonantes.");
		System.out.println("La palabra " + palabra + " tiene " + contadorMayusculas + " mayusculas.");
		System.out.println("La palabra "+ (palindromo?"":"no") + " es palindromo");
		

	}
}
import java.util.Scanner;

public class Main {
	


	//Ex. 1: Crie uma fun��o chamada areaTriang que recebe dois argumentos (altura e base) e retorna a �rea do triangulo.
	
	public static double areaTriang (double aAltura, double aBase){
		return aAltura*aBase/2;
	}
	
	//Ex. 2: Crie uma fun��o chamada areaRetang que recebe dois argumentos (altura e comprimento) e retorna a �rea do ret�ngulo.
	public static double areaRetang (double aAltura, double aBase){
		return aAltura*aBase/2;
	}
	
	/*Ex. 3: Crie uma fun��o chamada areaCal que recebe tr�s argumentos (x, y, z) 
	 * e retorna a �rea do triangulo caso z = 1 e retorna a �rea do ret�ngulo caso contr�rio.*/
	public static double areaCalc (double x, double y, double z) {
		if(z==1) {
			return areaTriang (x,y);
		}else {
			return areaRetang (x,y);
		}
	}
	
	/*Ex. 4: Crie uma fun��o chamada factor que recebe um argumento (n) 
	 * e calcula o seu fatorial usando um ciclo (for ou while).*/
	public static int factor(int n) {
		
		if (n==0) {
			return 1;
		}else {
			int i=n;
			int factorial=1;
			while (i>0) {
				factorial=factorial*i;
				i--;
			}
			return factorial;
		}
	}
	
	/*Ex. 4: Crie uma fun��o chamada factor que recebe um argumento (n) 
	 * e calcula o seu fatorial usando um ciclo (for ou while).*/
	

	public static int factorB(int n) {
		
		if (n==0) {
			return 1;
		}else {
			int factorial=1;
			for (int i=n; i>0; i--) {
				factorial=factorial*i;
			}
			return factorial;
		}
	}
	
	/*Ex. 5: Crie uma fun��o chamada factorRecursivo que recebe um argumento (n) 
	 * e calcula o seu fatorial (recursivamente). */
	
	public static int factorRecursivo(int n) {
		if (n==0) {
			return 1;
		}else {
			return n*factorRecursivo(n-1);	
		}
	}
	
	/*Ex. 6: Crie uma fun��o chamada numTotalVogais que recebe uma String (frase) 
	 * e retorna o n�mero total de vogais na mesma.*/
		
	public static int numTotalVogais(String aFrase) {
		String frase = aFrase.toLowerCase();
		int numTotalVogais=0;
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u'){
				numTotalVogais++;
				}  //Falta pensar nas letras Mai�sculas
		}
		return numTotalVogais;
	}
	
	/*Ex.  7:Crie  uma  fun��o chamada  numVogais que  recebe  uma  String  (frase)
	 *   e imprime  a quantidade de cada vogal na mesma.*/
	
	public static void numVogais(String aFrase) {
		int numVogalA=0, numVogalE=0, numVogalI=0, numVogalO=0, numVogalU=0;
		String frase= aFrase.toLowerCase();
		for(int i=0;i<aFrase.length();i++) {
			if(frase.charAt(i)=='a'){
				numVogalA++;
				}
			if(frase.charAt(i)=='e'){
				numVogalE++;
				}
			if(frase.charAt(i)=='i'){
				numVogalI++;
				}
			if(frase.charAt(i)=='o'){
				numVogalO++;
				}
			if(frase.charAt(i)=='u'){
				numVogalU++;
				}
		}
		System.out.println("a " + numVogalA + "\ne " + numVogalE + "\ni " + numVogalI + "\no " + numVogalO +"\nu " + numVogalU);;
	}
	
	/* Ex. 8:Escreva uma fun��o chamada convertSecondsque recebe um n�mero (segundos) 
	 * e imprimeo n�merode minutos, horas, dias e meses (considere que um m�s tem 30 dias).
	 */
	
	public static void convertSeconds(int aSegundos) {
		int segundos, minutos, horas, dias, meses;
		meses= aSegundos/(30*24*60*60);
		dias=(aSegundos-meses*30*24*60*60)/(60*60*24);
		horas= (aSegundos-meses*30*24*60*60-dias*24*60*60)/(60*60);
		minutos= (aSegundos-meses*30*24*60*60-dias*24*60*60-horas*60*60)/60;
		segundos= aSegundos-meses*30*24*60*60-dias*24*60*60-horas*60*60 -minutos*60;
		System.out.println("Months: " + meses + "\nDays: " + dias +"\nHour: " + horas + "\nMinutes: " + minutos + "\nSeconds: " + segundos);
		
		meses= aSegundos/(30*24*60*60);
		dias=(aSegundos%(30*24*60*60))/(60*60*24);  //aSegundos%(30*24*60*60) d� o resto da divis�o de aSegundos por (30*24*60*60)
		horas= (aSegundos%(60*60*24))/(60*60);
		minutos= (aSegundos%(60*60))/60;
		segundos= aSegundos%60;
		System.out.println("\nMonths: " + meses + "\nDays: " + dias +"\nHour: " + horas + "\nMinutes: " + minutos + "\nSeconds: " + segundos);
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Ex. 6
		System.out.print("Insira uma frase: ");
		String frase = sc.nextLine();
		int numTotalVogais = numTotalVogais(frase);
		System.out.print("A frase inserida tem, no total, " + numTotalVogais + " vogais.");
		
		// Ex. 7
		System.out.print("\n\nInsira uma frase: ");
		frase = sc.nextLine();
		numVogais(frase);
		
		// Ex. 8
		System.out.print("\n\nInsira o n�mero de segundos: ");
		int segundos = sc.nextInt();
		convertSeconds(segundos);
		
		
		sc.close();

	}
	


}

package Tabuada;
import java.io.*;

public class Tabuada {

	public static void main(String[] args) throws IOException  {
	BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	int numeroTabu=0;
	int cont =0;
	int multi;
	
	
		System.out.println("Digite o numero de qual tabuada que voce quer (0 a 10): ");
		numeroTabu = Integer.parseInt(teclado.readLine());
		
		if (numeroTabu <= 0) {
		System.out.println("Digite apenas numeros maior que 0");
		}else if (numeroTabu > 10) {
			System.out.println("Digite apenas as tabuadas de 0 a 10");
		}
		
		System.out.println("------------------------------------------------------");
		while(cont <= 9) {
			cont++;
			multi = numeroTabu*cont;
			
			System.out.println(numeroTabu+" X "+cont+" = "+multi );
		}
		
		
		
	
	}
}
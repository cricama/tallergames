package Operario;
import java.util.Scanner;


public class Operario {

	private static final Operario OP = null;
	private Scanner teclado;
	private int[] sueldos;
	
	//costrutor
	
	public Operario() {
		
		teclado = new Scanner(System.in);
		sueldos=new int[5];
		
		for(int f=0;f<5;f++) {
			
			System.out.println("ingrese el valor del componente ");
			sueldos[f]=teclado.nextInt();
			
			
			
			
			
		}
		
	}
	
	
	public void imprimir() {
		
for(int f=0;f<5;f++) {
			
			System.out.println(sueldos[f]);
		
			
	}
	
}
	
	public static void main(String[] args) {

		Operario OP=new Operario();
		
		OP.imprimir();

	}

}

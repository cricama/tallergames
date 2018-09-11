package Empleados;
import java.util.Scanner;

public class operarios {
	private Scanner teclado;
	private int[]sueldos;
	public operarios() {
		teclado=new Scanner(System.in);
		sueldos= new int[5];
		for(int f=0; f<5;f++) {
			System.out.println("ingrese datos del empleado");
			sueldos[f]=teclado.nextInt();
			
		}
		
	}
	
	public void imprimir() {
		for(int f=0; f<5;f++) {
			System.out.println(sueldos[f]);
			
		}
	}
	
	public static void main(String[] args) {
	operarios op=new operarios();
	op.imprimir();
		
		
	}

}

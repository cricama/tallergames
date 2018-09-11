package datos;
import java.util.Scanner;
public class alumno {
	private Scanner teclado;
	private String nombre;
	private int edad;
	public alumno() {
		teclado=new Scanner(System.in);
		System.out.println("ingrese nombre");
		nombre=teclado.next();
		System.out.println("ingrese edad");
		edad=teclado.nextInt();
	}
	public void imprimir() {
		System.out.println("nombre: "+nombre);
		System.out.println("edad: "+edad);
	}
	
	
	public void esmayordeedad() {
		if(edad>=18) {
			System.out.println(nombre+"es mayor de edad");
		}
		else {
			System.out.println(nombre+"no es mayor de edad");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alumno alumno1=new alumno();
		alumno1.imprimir();
		alumno1.esmayordeedad();

	}

}

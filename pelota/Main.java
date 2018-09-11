package pelota;
import java.util.Scanner;
import pelota.Pelota;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		Pelota P= new Pelota(300,600);
		System.out.println("la pelota pesa: "+P.ObtenerPeso());
		System.out.println("EL RADIO DE LA PELOTA ES: "+P.ObtenerRadio());
		
		P.Atraparpelota();
		P.paterarpelota();

	}

}

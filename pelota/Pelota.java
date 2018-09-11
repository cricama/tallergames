package pelota;

public class Pelota {

public static final String Obtenerpeso = null;
float radio;
float peso;
public Pelota() {
	
	radio = 100;
	peso =250;
	
  }
public Pelota(float radio,float peso) {
	
	this.radio=radio;
	
	this.peso=peso;
	
    }
  
   public float ObtenerRadio() {
	   
	   return radio;
   }
   
   public float ObtenerPeso() {
	    
	   return peso;
	   
   }
   
   public void paterarpelota() {
	   
	   System.out.println("se ha patiado la pelota");
   }
   
   public void Atraparpelota() {
	   
	   
	   System.out.println("se ha atrapado la pelota ");
   }

}

package Ascensor;

public class App {

	public static void main(String[] args) {
		 Ascensor a1, a2;
		 	
	        a1 = new Ascensor(2,14);
	        a2 = a1;
	        a1.ir(6);
	        a2.bajar();
	        a1 = new Ascensor(-1, a1.getMax()/2);
	       
	        a1.ir(a2.getPiso());
	        a1.subir();
	        a2.bajar();
	        System.out.println("------- SEGUNDA PARTE ------------");
	        Ascensor asc1, asc2, asc3;
	        asc1 = new Ascensor(0,19);
	        asc2 = new Ascensor(-4,4);
	        asc3 = new Ascensor(-2,10);
	       
	        asc1.ir(5);
	        asc2.ir(asc1.getPiso()-10);
	        asc3.ir(asc1.getPiso()+asc2.getPiso());
	        
	        while(asc1.getPiso()>0) {
	        	asc1.bajar();
	        	asc2.bajar();
	        	asc3.bajar();
	        }
	}

}

package sentencias;
import java.util.*;

public class Sentencias {

		public static void main(String[] args) {
//			System.out.println("Problema 1 " );
//			p1();
//			System.out.println("Problema 2 " );
//			p2();
//			
//			System.out.println("Problema 3 " );
//			p3();
			System.out.println("Problema 4 " );
			p4();
//			System.out.println("Problema 5 " );
//			p5();
//			System.out.println("Problema 6 " );
//			p6();
//			System.out.println("Problema 7 " );
//			System.out.println("Problema 8 " );
//			p8();
//			System.out.println("Problema 9 " );
//			p9();
//			System.out.println("Problema 10 " );
//			p10();
//			System.out.println("Problema 11 " );
//			p11();
//			System.out.println("Problema 12 " );
//			p12();
//			System.out.println("Problema 13 " );
//			p13();
//			System.out.println("Problema 14 " );
//			p14();
			
		}

		public static void p1() {
		
		}
		public static void p2() {
			
		}
		
		public static void p3() {
		Scanner rd = new Scanner(System.in);
		System.out.println("Cuanto Dinero Tengo");
		int dinero = rd.nextInt();
//		switch(dinero) {
//		case 5: System.out.println("Vamos al parque");break;
//		case 0: System.out.println("No salimos");break;
//		case 10: System.out.println("Vamos al video club");break;
		if(dinero == 0 ) 
			System.out.println("No salimos >:C");
		else if(dinero <= 5)
			System.out.println("Vamos al parque");
		else if(dinero <= 10)
			System.out.println("Vamos al videoclub");	
		else
			System.out.println("Vamos al Cine");
		
		}
		
		
		public static void p4() {
		int contador = 0;
		do {
			Scanner rd = new Scanner(System.in);
			System.out.println("Cuanto Dinero Tengo");
			int dinero = rd.nextInt();
			if(dinero == 0 ) 
				System.out.println("No salimos >:C");
			else if(dinero <= 5)
				System.out.println("Vamos al parque");
			else if(dinero <= 10)
				System.out.println("Vamos al videoclub");	
			else
				System.out.println("Vamos al Cine");
			
			contador++;
			
		}while(contador <= 5);
		}
		public static void p5() {}
		public static void p6() {}
		public static void p7() {}
		public static void p8() {}
		public static void p9() {}
		public static void p10() {}
		public static void p11() {}
		public static void p12() {}
		public static void p13() {}
		public static void p14() {}

	

}

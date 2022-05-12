package variablesyConstantes;

import java.util.*;

public class variablesyConstantes {

		public static void main(String[] args) {
//			System.out.println("Problema 1 " );
//			p1();
//			System.out.println("Problema 2 " );
//			p2();
//			
//			System.out.println("Problema 3 " );
//			p3();
//			System.out.println("Problema 4 " );
//			p4();
//			p4bis();
//			System.out.println("Problema 5 " );
//			p5();
//			System.out.println("Problema 6 " );
//			p6();
//			System.out.println("Problema 7 " );
//			p7();
//			System.out.println("Problema 8 " );
//			p8();
//			System.out.println("Problema 9 " );
//			p9();
//			System.out.println("Problema 10 " );
//			p10();
			System.out.println("Problema 11 " );
			p11();
//			System.out.println("Problema 12 " );
//			p12();
//			System.out.println("Problema 13 " );
//			p13();
//			System.out.println("Problema 14 " );
//			p14();
			
		}

		public static void p1() {
			Boolean x = true;
			Boolean y = false;
			System.out.println(x || y);
//			true or true = true
//			true or false = true
//			false or true = true
//			false or false = false
			System.out.println(x && y);
		}
		public static void p2() {
			int x=7;
			System.out.println(x == 25);
		}
		
		public static void p3() {
			int x = 25;
			int y = 77;
			System.out.println(x != y);
		}
		public static void p4() {
			int a=4, b=6, c=7, d=8, e=9, f=8;
			int p = ( a + b - c * (d / e)) * f;
			System.out.println("Resultado: " + p);
		}
		public static void p4bis() {
			Scanner sc  = new Scanner(System.in);
			
			int cont = 0;
			System.out.println("5 numeros a sumar: ");
			for(int x = 0; x <= 5; x++) {
				System.out.println("Introduce un numero");
				int num = sc.nextInt();
				cont += num;
			}
			System.out.println("resultado: "+ cont);
			
		}
		public static void p5() {}
		public static void p6() {}
		public static void p7() {}
		public static void p8() {}
		public static void p9() {
			int numero = 37;
			for(int x = 0; x <= 10; x++) {
				System.out.println(numero + "x" + x + "=" + (numero*x));
			}
		}
		public static void p10() {
			for(int x = 0; x <= 5000; x++) {
				if(x == 25) {
					System.out.println("aqui el "+ x + ", Paro");
					break;
				}
				System.out.println("nº " + x );
					
			}
		}
		public static void p11() {

			for(int x = 4; x <=296; x++ ) {
				if(x%5 == 0) {
					continue;
				}
				System.out.println("nº " + x);
			}
		}
		public static void p27() {}
		public static void p13() {}
		public static void p14() {}

	

}

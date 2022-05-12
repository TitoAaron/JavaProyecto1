package arrays;

import java.util.*;

public class arrays {
	public static void main(String[] args) {
//		System.out.println("Problema 1 " );
//		p1();
//		System.out.println("Problema 2 " );
//		p2();
//		
//		System.out.println("Problema 3 " );
//		p3();
//		System.out.println("Problema 4 " );
//		p4();
//		System.out.println("Problema 5 " );
//		p5();
//		System.out.println("Problema 6 " );
//		p6();
//		System.out.println("Problema 7 " );
//		p7();
//		System.out.println("Problema 8 " );
//		p8();


		System.out.println("Problema 10 " );
		p10();
//		System.out.println("Problema 11 " );
//		p11();
//		System.out.println("Problema 12 " );
//		p12();
//		System.out.println("Problema 13 " );
//		p13();
//		System.out.println("Problema 14 " );
//		p14();
		
	}

	public static void p1() {
	
	}
	public static void p2() {
		
	}
	
	public static void p3() {

	}
	
	
	public static void p4() {
		
	}
	public static void p5() {}
	public static void p6() {}
	public static void p7() {
		boolean iguales = true;
		int v1 [] = new int[] {12346578};
		int v2 [] = new int[] {12346578};
		for( int a = 0; a <= v1.length-1; a++) {
			if(v1[a] != v2[a]) {
				iguales = false;
			}
		}
		if(!iguales)
			System.out.println("No son iguales!");
		else
			System.out.println("Son iguales");
	}  
	public static void p8() {}
	public static void p9() {}
	public static void p10() {
		int suma = 0;
		int matriz[][] = {{2,3,4},
							{4,5,6},
							{6,7,8}};
//		for(int x = 0; x <= matriz[0].length-1; x++) {
//			suma += matriz[0][x];
//		}
		System.out.println(matriz[1][2]);
	}
	public static void p11() {}
	public static void p12() {}
	public static void p13() {}
	public static void p14() {}
}

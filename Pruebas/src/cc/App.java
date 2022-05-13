package cc;

public class App {

	public static boolean igualar_dinero(CuentaCorriente c1, CuentaCorriente c2) {
		boolean igualado = false;
		double saldoC1 = c1.getSaldo();
		double saldoC2 = c2.getSaldo();
		double diferencia;
		if(saldoC1 > 0 || saldoC2 > 0) {
			diferencia = (saldoC1 + saldoC2)/2;
			c1.setSaldo(diferencia);
			c2.setSaldo(diferencia);
			igualado = true;
		}
		return igualado;
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		CuentaCorriente c1 = new CuentaCorriente("Paco",12,10.00,-100);
		CuentaCorriente c2 = new CuentaCorriente("Antonio",17,40.00,-100);
		igualar_dinero(c1,c2);
		System.out.println(c1);
		System.out.println(c2);
		
	}
	

}

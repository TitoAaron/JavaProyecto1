package Exercicipelota;

public class Pelota {
	private String nombre;
	private int presion;
	private boolean operativa;
	
	public Pelota(String nombre) {
		this.nombre = nombre;
		this.presion = 0;
		this.operativa = true;
	}
	
	void inflar(int n) {
		if(this.operativa) {
			this.presion += n;
			if(this.presion >= 25) {
				this.operativa = false;
			System.out.println("La pelota a reventado");
			}
		}
		
	}
	
	void desinflar(int n) {
		if(this.operativa) {
			this.presion -= n;
			if(this.presion <= 0) {
				this.operativa = false;
			System.out.println("La pelota esta desinflada");
			}
		}
	}

	public String botar() {
		if(!operativa) 
			return "La pelota de " + this.nombre + " a reventado no puede botar";
		return "La pelota de " + this.nombre + " hace BOING BOING";
		
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", inflado=" + presion;
	}
	
}

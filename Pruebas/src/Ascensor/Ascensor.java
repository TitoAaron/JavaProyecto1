package Ascensor;

public class Ascensor {
	private int piso;
	private int min;
	private int max;
	
	
	public Ascensor( int min, int max) {
		this.piso = this.min;
		this.min = min;
		this.max = max;
	}

	void  ir(int n) {
		if(n <= this.max || n >= this.min) {
			this.piso = n;
			System.out.println("El ascensor esta en el piso: " + this.piso);
		}else
			System.out.println("El piso no existe");
	}
	
	void bajar() {
		if( this.piso > this.min) {
			this.piso--;
			System.out.println("El ascensor esta en el piso: " + this.piso);
		}else
			System.out.println("No puede bajar mas");
	}
	
	void subir() {
		if(this.piso < this.max) {
			this.piso++;
			System.out.println("El ascensor esta en el piso: " + this.piso);
		}else
			System.out.println("No puede subir mas");
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	
	
	
	
}

package Pruebas;

public class Animal {
	private String nombre;
	private int nExtremidades;
	private String Habitat;
	private String Alimentacion;
	private String especie;
	private boolean isHambriento = true;
	

	public Animal(String nombre, int nExtremidades, String habitat, String alimentacion, String especie) {
		this.nombre = nombre;
		this.nExtremidades = nExtremidades;
		this.especie = especie;
		this.Habitat = habitat;
		this.Alimentacion = alimentacion;
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getnExtremidades() {
		return nExtremidades;
	}




	public void setnExtremidades(int nExtremidades) {
		this.nExtremidades = nExtremidades;
	}




	public String getHabitat() {
		return Habitat;
	}




	public void setHabitat(String habitat) {
		Habitat = habitat;
	}




	public String getAlimentacion() {
		return Alimentacion;
	}




	public void setAlimentacion(String alimentacion) {
		Alimentacion = alimentacion;
	}




	public String getEspecie() {
		return especie;
	}




	public void setEspecie(String especie) {
		this.especie = especie;
	}




	public boolean isHambriento() {
		return isHambriento;
	}




	public void setHambriento(boolean isHambriento) {
		this.isHambriento = isHambriento;
	}




	void Come() {
		if(this.isHambriento) {
			System.out.println(this.nombre + " come");
			this.isHambriento = false;
		}else 
			System.out.println(this.nombre + " ya esta lleno");
	}

	
}

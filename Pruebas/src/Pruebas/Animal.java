package Pruebas;

public class Animal {
	private String nombre;
	private int nExtremidades;
	private String Habitat;
	private String Alimentacion;
	

	public Animal(String nombre, int nExtremidades, String habitat, String alimentacion) {
		super();
		this.nombre = nombre;
		this.nExtremidades = nExtremidades;
		Habitat = habitat;
		Alimentacion = alimentacion;
	}






	@Override
	public String toString() {
		return "nombre: " + nombre + "\n" + 
				"nExtremidades: " + nExtremidades + "\n"+
				"Habitat: " + Habitat + "\n" + 
				"Alimentacion: " + Alimentacion + "\n";
	}
	
	
	
}

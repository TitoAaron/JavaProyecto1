

package Pruebas;

public class Tigre extends Animal{
	private String Color;
	private int Edad;

	
	
	public Tigre(String nombre, int nExtremidades, String Habitat, String Alimentacion, String especie, int edad, String Color) {
		super(nombre, nExtremidades, Habitat, Alimentacion,especie);
		this.Edad = edad;
		this.Color = Color;
	}
	
	
	

	@Override
	public String toString() {
		String Hambriento;
		if(this.isHambriento()) {
			Hambriento = "Si";
		}else {
			Hambriento = "No";
		}
		return "nombre: " + this.getNombre() + "\n" + 
				"nExtremidades: " + this.getnExtremidades() + "\n"+
				"Tiene Hambre ? " + Hambriento + "\n" +
				"Habitat: " + this.getHabitat() + "\n" + 
				"Alimentacion: " + this.getAlimentacion() + "\n" + 
				"Color: " + Color + "\n" +
				"Edad: " + Edad + "\n";
	}
	
	
	
}

package Pruebas;

public class Jirafa extends Animal {
	
	private String Color ;
	private int Edad;
	

	
	public Jirafa(String nombre, int nExtremidades, String habitat, String alimentacion, String especie, String color,
			int edad) {
		super(nombre, nExtremidades, habitat, alimentacion, especie);
		this.Color = color;
		this.Edad = edad;

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

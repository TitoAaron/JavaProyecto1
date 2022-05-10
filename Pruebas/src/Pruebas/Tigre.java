package Pruebas;

public class Tigre extends Animal{
	private String Color = "Naranja";
	private int Edad;
	private boolean isHambriento = true;
	
	
	public Tigre(String nombre, int nExtremidades, String Habitat, String Alimentacion, int edad) {
		super(nombre, nExtremidades, Habitat, Alimentacion);
		this.Edad = edad;
	}
	
	
	void tigreCome() {
		if(this.isHambriento) {
			System.out.println("El tigre come");
			this.isHambriento = false;
		}else 
			System.out.println("El tigre ya esta lleno");
	}

	@Override
	public String toString() {
	
		String Hambriento;
		if(isHambriento) {
			Hambriento = "Si";
		}else {
			Hambriento = "No";
		}
		return super.toString() + 
				"color: " + Color + "\n"
				+ "Edad: " + Edad + "\n"
				+ "Tiene Hambre ? " + Hambriento ;
	}
	
	
	
}

public class Cd extends UnidadAlmacenamiento{
	private static final String UNIDAD_MEMORIA = " MB";
	private static final String UNIDAD_LECTURA = " KB/s";
	private static final String UNIDAD_ESCRITURA = "x";

	public Cd(int capacidad, int velocidadLectura, int velocidadEscritura){
		super(capacidad, velocidadLectura, velocidadEscritura, true);
	}

	public Cd(int capacidad, int velocidadLectura){
		super(capacidad, velocidadLectura, 0, false);
	}

	public void girarDisco(){
		System.out.println("CD girando...");
	}
	public void guardarDatos(){
		if (super.permiteEscritura)
			System.out.println("Guardando datos en el CD...");
		else
			System.out.println("No se pudo guardar los datos. El CD es de solo lectura");
	}
	public void leerDatos(){
		System.out.println("Leyendo datos del CD...");
	}
	public String toString(){
		String temp = "CD\nCapacidad: "+ super.capacidad + UNIDAD_MEMORIA + ", Velocidad de lectura: "+ super.velocidadLectura + UNIDAD_LECTURA;
		if (super.permiteEscritura == true)
			temp += ", Velocidad de escritura: "+ super.velocidadEscritura + UNIDAD_ESCRITURA + ", Permite escritura: " + super.permiteEscritura;
		else
			temp += ", Permite escritura: " + super.permiteEscritura;
		return temp;
	}
}
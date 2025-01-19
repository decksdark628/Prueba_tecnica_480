public class BluRay extends UnidadAlmacenamiento implements PermiteEscritura{
	private static final String UNIDAD_MEMORIA = " GB";
	private static final String UNIDAD_LECTURA = " MB/s";
	private static final String UNIDAD_ESCRITURA = "x";

	public BluRay(int capacidad, int velocidadLectura, int velocidadEscritura){
		super(capacidad, velocidadLectura, velocidadEscritura, true);
	}

	public BluRay(int capacidad, int velocidadLectura){
		super(capacidad, velocidadLectura, 0, false);
	}

	public void girarDisco(){
		System.out.println("Blu-Ray girando...");
	}
	public void guardarDatos(){
		if (super.permiteEscritura)
			System.out.println("Guardando datos en el Blu-Ray...");
		else
			System.out.println("No se pudo guardar los datos. El Blu-Ray es de solo lectura");
	}
	public void leerDatos(){
		System.out.println("Leyendo datos del Blu-Ray...");
	}
	public String toString(){
		String temp = "BLU-RAY\nCapacidad: "+ super.capacidad + UNIDAD_MEMORIA + ", Velocidad de lectura: "+ super.velocidadLectura + UNIDAD_LECTURA;
		if (super.permiteEscritura == true)
			temp += ", Velocidad de escritura: "+ super.velocidadEscritura + UNIDAD_ESCRITURA + ", Permite escritura: " + super.permiteEscritura;
		else
			temp += ", Permite escritura: " + super.permiteEscritura;
		return temp;
	}
}
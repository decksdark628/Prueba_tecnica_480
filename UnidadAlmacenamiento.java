public abstract class UnidadAlmacenamiento implements DiscoGiratorio{
	protected int capacidad;
	protected int velocidadLectura;
	protected int velocidadEscritura;
	protected final boolean permiteEscritura;

	public UnidadAlmacenamiento(int capacidad, int velocidadLectura, int velocidadEscritura, boolean permiteEscritura){
		this.capacidad = capacidad;
		this.velocidadLectura = velocidadLectura;
		this.velocidadEscritura = velocidadEscritura;
		this.permiteEscritura = permiteEscritura;
	}

	public boolean getPermiteEscritura(){
		return permiteEscritura;
	}

	public abstract void girarDisco();
	public void guardarDatos(){
		if (permiteEscritura)
			System.out.println("Guardando datos...");
		else
			System.out.println("No se pudo guardar los datos.");
	}
	public abstract void leerDatos();
	public abstract String toString();
}
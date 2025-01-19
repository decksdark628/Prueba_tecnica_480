public abstract class UnidadAlmacenamiento{
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
	public abstract void guardarDatos();
	public abstract void leerDatos();
	public abstract String toString();
}
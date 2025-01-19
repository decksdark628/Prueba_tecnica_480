public class DiscoDuro extends UnidadAlmacenamiento implements PermiteEscritura{
	private static final String UNIDAD_MEMORIA = " GB";
	private static final String UNIDAD_LECTURA_ESCRITURA = " MB/s";
	private static final String UNIDAD_ROTACION = " RPM";
	private static final String UNIDAD_CACHE = " MB";
	private int velocidadRotacion;
	private int memoriaCache;

	public DiscoDuro(int capacidad, int velocidadLectura, int velocidadEscritura, int velocidadRotacion, int memoriaCache){
		super(capacidad, velocidadLectura, velocidadEscritura, true);
		this.velocidadRotacion = velocidadRotacion;
		this.memoriaCache = memoriaCache;
	}

	public int getVelocidadRotacion(){
		return velocidadRotacion;
	}

	public void setVelocidadRotacion(int velocidadRotacion){
		this.velocidadRotacion = velocidadRotacion;
	}

	public int getMemoriaCache(){
		return memoriaCache;
	}

	public void setMemoriaCache(int memoriaCache){
		this.memoriaCache = memoriaCache;
	}

	public void girarDisco(){
		System.out.println("Disco duro girando...");
	}
	public void guardarDatos(){
		System.out.println("Guardando datos en el disco duro...");
	}
	public void leerDatos(){
		System.out.println("Leyendo datos del disco duro...");
	}
	public String toString(){
		return "DISCO DURO\nCapacidad: "+ super.capacidad + UNIDAD_MEMORIA + ", Velocidad de lectura: "+ super.velocidadLectura + UNIDAD_LECTURA_ESCRITURA + ", Velocidad de escritura: "+ super.velocidadEscritura + UNIDAD_LECTURA_ESCRITURA + ", Velocidad de rotacion: " + velocidadRotacion + UNIDAD_ROTACION + ", Memoria cache: " + memoriaCache + UNIDAD_CACHE;
	}
}
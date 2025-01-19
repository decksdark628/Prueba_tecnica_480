public class Vinilo extends UnidadAlmacenamiento{
	private static final String FORMATO = "LP";
	private static final String UNIDAD_MEMORIA = " minutos por cara";
	private static final String UNIDAD_LECTURA = " RPM";

	public Vinilo(){
		super(22, 33, 0, false);
	}
	public void girarDisco(){
		System.out.println("Vinilo girando...");
	}
	public void leerDatos(){
		System.out.println("Leyendo datos del vinilo...");
	}
	public String toString(){
		return "VINILO\nFormato: " + FORMATO + ", Capacidad: " + super.capacidad + UNIDAD_MEMORIA + ", Velocidad de lectura: " + super.velocidadLectura + UNIDAD_LECTURA;
	}
}
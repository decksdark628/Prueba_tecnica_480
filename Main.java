public class Main{
	public static void probarFuncionamiento(UnidadAlmacenamiento ua){
		System.out.println(ua);
		ua.girarDisco();
		ua.guardarDatos();
		ua.leerDatos();
		System.out.println();
	}

	public static void main(String[] args){
		DiscoDuro dsc = new DiscoDuro(500, 80, 60, 5400, 64);
		probarFuncionamiento(dsc);

		Cd soloLectura = new Cd(700, 150, 10);
		probarFuncionamiento(soloLectura);

		Cd lecturaEscritura = new Cd(700, 150);
		probarFuncionamiento(lecturaEscritura);
	}
}
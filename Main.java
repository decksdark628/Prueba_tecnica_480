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

		Cd cdLecturaEscritura = new Cd(700, 150, 10);
		probarFuncionamiento(cdLecturaEscritura);

		Cd cdLectura = new Cd(700, 150);
		probarFuncionamiento(cdLectura);

		BluRay blrLecturaEscritura = new BluRay(25, 36, 6);
		probarFuncionamiento(blrLecturaEscritura);

		BluRay blrLectura= new BluRay(25, 36);
		probarFuncionamiento(blrLectura);

		Vinilo vnl = new Vinilo();
		probarFuncionamiento(vnl);
	}
}
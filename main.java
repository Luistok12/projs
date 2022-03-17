
public class main {

	public static void main(String[] args) {
		Cadena l1 = new Cadena();
		Cadena l2 = new Cadena();
		l1.linea="Hola chicos de POO 2021";
		l2.linea="En casa, pero trabajando";
		System.out.println(l1.cantidadPalabras());
		System.out.println(l1.cantidadCaracteres());
		System.out.println(l2.cantidadPalabras());
		System.out.println(l2.cantidadCaracteres());
	}

}


public class Cadena {
	String linea;
	
	public int cantidadPalabras() {
		int c=0;
		for(int i=0; i<linea.length(); i++) {
			if(linea.charAt(i)==' ')
				c++;
		}
		return c+1;
	}
	
	public int cantidadCaracteres() {
		return linea.length();
	}
	
}

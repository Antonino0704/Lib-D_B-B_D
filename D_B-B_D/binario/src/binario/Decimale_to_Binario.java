package binario;

public class Decimale_to_Binario {
	private int numero, resto;
	private StringBuilder string;
	
	public Decimale_to_Binario(int numero) {
		this.numero = numero;
		resto = 0;
		string = new StringBuilder();
	}
	
	public int Convert_B() {
		do {
			resto = numero % 2;
			numero /= 2;
			string.append(Integer.toString(resto));
		} while(numero != 1);
		string.append('1');
		return Integer.parseInt(string.reverse().toString());
	}

}

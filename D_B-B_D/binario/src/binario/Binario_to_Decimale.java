package binario;

public class Binario_to_Decimale {
	private int max, risultato;
	private String str1;
	private String[] array;
	
	public Binario_to_Decimale(int numero) {
		str1 = Integer.toString(numero);
		array = str1.split("");
		max = array.length - 1;
	}
	
	public int Convert_D() {
		for(int i = 0; i<array.length; i++, max--) {
			if(array[max].equals("1")) {
				risultato += (Math.pow(2, i));
			}
		}
		return risultato;
	}

}

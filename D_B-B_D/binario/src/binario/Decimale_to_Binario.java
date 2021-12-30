package binario;

/**
 * Convert decimal number to number binary
 * @author Buscarino Antonino
 * @version 1.1.2
 *
 */
public class Decimal_to_binary {
	private int num, rest;
	private StringBuilder string;
	
	/**
	 * Constructor
	 * @param num
	 */
	public Decimal_to_binary(int num) {
		this.num = num;
		rest = 0;
		string = new StringBuilder();
	}
	
	/**
	 * this method converts a decimal number passed in the constructor to binary,
	 * save the rest(number % 2) in an StringBuilder object until the number has value 1
	 * <br>
	 * <b>alert this method not working with a negative number or greater than 1023</b>
	 * @return number convert in binary
	 */
	public int convert() {
		while(num != 1 && num != 0) {
			rest = num % 2;
			num /= 2;
			string.append(Integer.toString(rest));
		} 
		if(num == 0) {
			return 0;
		}
		string.append('1');
		return Integer.parseInt(string.reverse().toString());
	}
}

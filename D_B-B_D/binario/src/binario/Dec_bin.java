package binario;

/**
 * Convert decimal number to number binary
 * @author Buscarino Antonino
 *	@version 1.0.0
 */
public class Dec_bin extends Decimal_to_binary {
	private int num_origin;
	
	/**
	 * Constructor
	 * @param num
	 */
	public Dec_bin(int num) {
		super(num);
	}
	
	/**
	 * this method converts a decimal number passed in the constructor to binary,
	 * save the rest(number % 2) in an StringBuilder object until the number has value 1
	 * <br>
	 * <b>alert this method not working with number greater than 1023</b>
	 * @return number convert in binary
	 */
	@Override
	public int convert() {
		changeSymbol();
		while(num != 1 && num != 0) {
			rest = num % 2;
			num /= 2;
			string.append(Integer.toString(rest));
		} 
		if(num == 0) {
			return 0;
		}
		string.append('1');
		return Integer.parseInt(checkSymbol());
	}
	
	/**
	 * this method converts a decimal number passed in the constructor to binary,
	 * save the rest(number % 2) in an StringBuilder object until the number has value 1
	 * 
	 * @return number convert in binary as string
	 */
	public String convertInString() {
		changeSymbol();
		while(num != 1 && num != 0) {
			rest = num % 2;
			num /= 2;
			string.append(Integer.toString(rest));
		} 
		if(num == 0) {
			return "0";
		}
		string.append('1');
		return checkSymbol();
	}
	
	/**
	 * this method converts a decimal number passed in the constructor to binary,
	 * save the rest(number % 2) in an StringBuilder object until the number has value 1
	 * 
	 * @return number convert in binary as double
	 */
	public double convertInDouble() {
		changeSymbol();
		while(num != 1 && num != 0) {
			rest = num % 2;
			num /= 2;
			string.append(Integer.toString(rest));
		} 
		if(num == 0) {
			return 0;
		}
		string.append('1');
		return Double.parseDouble(checkSymbol());
	}
	
	/*
	 * change the symbol of the number if it is negative
	 */
	private void changeSymbol() {
		num_origin = num;
		if(num < 0) {
			num += -(num+num);
		}
	}
	
	/*
	 * check if the starting number was negative or not
	 */
	private String checkSymbol() {
		if(num_origin < 0) {
			return "-" + string.reverse().toString();
		}
		return string.reverse().toString();
	}

}

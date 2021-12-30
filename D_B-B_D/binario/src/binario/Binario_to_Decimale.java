package binario;

/**
 * Convert binary number to number decimal
 * @author Buscarino Antonino
 * @version 1.0.1
 *
 */
public class Binary_to_decimal {
	private int index, result;
	private String[] array;
	
	/**
	 * Constructor
	 * @param num
	 */
	public Binary_to_decimal(int num) {
		String str = Integer.toString(num);
		array = str.split("");
		index = array.length - 1;
		result = 0;
	}
	
	/**
	 * this method checks which elements of the split array have value 1 and
	 * adds the sum between result and 2 raised to the position of the element being checked
	 *  <br>
	 *  <b>alert if the number is negative, it returns the number converted to a positive decimal</b>
	 * @return number convert in decimal
	 */
	public int convert() {
		for(int i=0; i<array.length; i++, index--) {
			if(array[index].equals("1")) {
				result += (Math.pow(2, i));
			}
		}
		return result;
	}

}


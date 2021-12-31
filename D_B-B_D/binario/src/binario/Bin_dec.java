package binario;

/**
 * Convert binary number to number decimal
 * @author Buscarino Antonino
 * @version 1.0.0
 *
 */
public class Bin_dec extends Binary_to_decimal {
	
	/**
	 * Constructor
	 * @param num
	 * @throws NumberNotValidException 
	 */
	public Bin_dec(int num) throws NumberNotValidException {
		super(num);
		checkNumber();
	}
	
	/**
	 * this method checks which elements of the split array have value 1 and
	 * adds the sum between result and 2 raised to the position of the element being checked
	 * 
	 * @return number convert in decimal
	 */
	@Override
	public int convert() {
		for(int i=0; i<array.length; i++, index--) {
			if(array[index].equals("1")) {
				result += (Math.pow(2, i));
			}
		}
		return checkSymbol();
	}
	
	/*
	 * check number are 1 or 0, if not launch NumberNotValidException
	 */
	private void checkNumber() throws NumberNotValidException {
		for(int i=0; i<array.length; i++) {
			if(!array[i].equals("1") && !array[i].equals("0") && !array[i].equals("-")) {
				throw new NumberNotValidException("number over 1");
			}
		}
	}
	
	/*
	 * check if the starting number was negative or not
	 */
	private int checkSymbol() {
		if(array[0].equals("-")) {
			return - result;
		}
		return result;
	}
}

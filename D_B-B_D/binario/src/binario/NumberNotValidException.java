package binario;

public class NumberNotValidException extends Exception {
	
	public NumberNotValidException(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		return "number not valid: " + super.getMessage();
	}

}

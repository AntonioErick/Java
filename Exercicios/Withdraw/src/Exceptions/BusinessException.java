package Exceptions;

public class BusinessException extends RuntimeException{

	private static final long serialException = 1L;
	
	public BusinessException(String msg) {
		super(msg);
	}
}

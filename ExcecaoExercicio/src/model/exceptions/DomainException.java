package model.exceptions;

public class DomainException extends RuntimeException  {

	/**
	 * nao e obrigado a tratar runtime
	 */
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
		
	}
}

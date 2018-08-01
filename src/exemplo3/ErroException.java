package exemplo3;

public class ErroException extends ArithmeticException{
	
	
	private String mensagem ;
	
	public ErroException(String mensagem) {
		this.mensagem  = mensagem;
	}

}

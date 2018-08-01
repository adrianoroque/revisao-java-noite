package exemplo2;

public class ContaPoupanca extends Conta{
	
	private Float RENDIMENTO = 0.01f;    //maiusculo é uma constante

	

	@Override
	Boolean saca(Float valor) {
		Float saldo = super.getSaldo();
		if (valor>0 && saldo >= valor) {
			super.setSaldo(saldo - valor);
		}
		return null;
	}



	public void rende() {
		Float novoSaldo = super.getSaldo() + super.getSaldo() * RENDIMENTO;
		super.setSaldo(novoSaldo);
	}



	@Override
	public void setID(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}

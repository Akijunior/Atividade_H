package Domain;

public abstract class Conta {
	
	protected double saldo;
	
	public void deposita(double valor) throws ValorInvalidoException{
		if (valor < 0){
			throw new ValorInvalidoException(0);
		}
		else
			this.saldo += valor - 0.10;
	}
	
	public void saca(double valor){
		saldo -= valor;
	}
	
	public abstract void atualiza(double taxaSelic);
	
	public double getSaldo(){
		return this.saldo;
	}

}

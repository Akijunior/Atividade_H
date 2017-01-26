package App;

import Domain.Conta;
import Domain.ContaPoupanca;
import Domain.ValorInvalidoException;

public class TestaDeposita {
	
	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* 5 - Ele passa a retornar nulo. */
		/* 6 - Passa a exigir um valor double para poder ser executada com êxito. */
		/* 7 - Ele passa a exigir uma "solução" para o problema com a entrada do throws. */
	}
}

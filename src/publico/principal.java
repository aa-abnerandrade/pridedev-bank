package publico;

import dominio.Conta;

public class principal {
	public static void main(String[] args) {
		Conta conta = new Conta ();
		conta.numAgencia = "0001";
		
		System.out.println(conta.numAgencia);
	}
	
}

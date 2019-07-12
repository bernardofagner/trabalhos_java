
public class Conta_Bancaria {

	/* Criar uma classe para representar uma conta bancária e realizar as
	 * operações consulta de saldo, saque, deposito. Testar na funçaõ main
	 * para verificar se os objetos estão funcionando.
	 */
	int numero;
	float saldo;
	
	void registra_usuario (int numeroConta){
		numero = numeroConta;
	}
	
	void saldo_inicial (){
		saldo = 1000;
	}
	
	void extrato (){
		System.out.println(saldo);
	}
	void deposito (float add){
		saldo += add;
	}
	
	void saque (int saque){
		saldo -= saque;
	}
	
	
	
	
	
	
}

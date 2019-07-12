
public class Conta_Bancaria_main {

	/*Criar objetos e realizar operações com os métodos da classe Conta_Bancaria
	 */
	public static void main(String[] args) {
		
		// Inicializa objetos do tipo Conta_Bancaria
		Conta_Bancaria cliente1 = new Conta_Bancaria();
		Conta_Bancaria cliente2 = new Conta_Bancaria();
		
		// Realiza operações com objeto cliente1
		cliente1.saldo_inicial();
		cliente1.deposito(50);
		cliente1.extrato();
		
		// Realiza operações com objeto cliente2
		cliente2.saldo_inicial();
		cliente2.saque(30);
		cliente2.extrato();
	}

}

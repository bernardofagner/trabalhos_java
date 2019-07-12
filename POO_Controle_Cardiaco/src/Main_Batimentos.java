import java.util.Scanner;


public class Main_Batimentos 
{
	public static void main(String[] args)
	{
		int num;
		String nome;
		//Cria objeto para ler dados do teclado.
		Scanner ler = new Scanner(System.in);
		// O construtor serve para que todos os dados do objeto sejam preenchidos de uma só vez
		//Implementação com valores definidos.
		Batimentos_Cardiacos paciente1 = new Batimentos_Cardiacos("Fagner", "Oliveira", 25, 05, 1989);
		System.out.println(paciente1);
		System.out.println("Idade:     " + paciente1.idade() + " anos.");
		System.out.println("Frequencia cardiaca maxima: " + paciente1.freq_max() + " BPM.");
		System.out.println("Frequencia cardiaca ideal entre: " + paciente1.freq_ideal_min() 
							+ " BPM e " + paciente1.freq_ideal_max() + " BPM.");
		//Alterar os valores dos atributos do objeto para avaliar uma nova pessoa
		System.out.println("Insira seu nome");
		nome = ler.nextLine();				// Lê uma string
		paciente1.set_nome(nome);
		System.out.println("Insira seu sobrenome");
		nome = ler.nextLine();
		paciente1.set_sobrenome(nome);
		System.out.println("Insira o dia de seu nascimento");
		num = ler.nextInt();				// Lê um inteiro
		paciente1.set_dia_nasc(num);
		System.out.println("Insira o mês de seu nascimento");
		num = ler.nextInt();
		paciente1.set_mes_masc(num);
		System.out.println("Insira o ano de seu nascimento");
		num = ler.nextInt();
		paciente1.set_ano_nasc(num);
		
		System.out.println(paciente1);
		System.out.println("Idade:     " + paciente1.idade() + " anos.");
		System.out.println("Frequencia cardiaca maxima: " + paciente1.freq_max() + " BPM.");
		System.out.println("Frequencia cardiaca ideal entre: " + paciente1.freq_ideal_min() 
							+ " BPM e " + paciente1.freq_ideal_max() + " BPM.");
		// Finaliza o objeto da classe Scanner
		ler.close();
	}
}

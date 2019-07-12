import java.util.Calendar;

import sun.util.resources.en.CalendarData_en_IE;


public class Batimentos_Cardiacos 
{
	private String nome, sobrenome;
	private int dia_nasc, mes_nasc, ano_nasc;
	
	//O CONSTRUTOR DEVE TER O MESMO NOME DA CLASSE
	public Batimentos_Cardiacos(String add_nome, String add_sobrenome, 
		   int add_dia_nasc,int add_mes_masc, int add_ano_nasc)
	{
		nome = add_nome;
		sobrenome = add_sobrenome;
		dia_nasc = add_dia_nasc;
		mes_nasc = add_mes_masc;
		ano_nasc = add_ano_nasc;
	}
	// Metodo utilizada para que o resultado exibido no Main seja mostrado de
	// forma formatada em uma string
	public String toString()
	{
		return "Batimentos_Cardiacos \nNome:      " + nome + "\nsobrenome: "
				+ sobrenome + "\ndia_nasc:  " + dia_nasc + "\nmes_nasc:  "
				+ mes_nasc + "\nano_nasc:  " + ano_nasc;
	}
	
	// MÉTODOS PARA DEFINIR OS VALORES DOS ATRIBUTOS
	public void set_nome(String add_nome)
	{
		nome = add_nome;
	}
	public void set_sobrenome(String add_sobrenome)
	{
		sobrenome = add_sobrenome;
	}
	public void set_dia_nasc (int dia)
	{
		dia_nasc = dia;
	}
	public void set_mes_masc (int mes)
	{
		mes_nasc = mes;
	}
	public void set_ano_nasc(int ano)
	{
		ano_nasc = ano;
	}
	
	//MÉTODOS PARA RECUPERAR VALORES DOS ATRIBUTOS
	public String get_nome()
	{
		return nome;
	}
	public String get_sobrenome()
	{
		return sobrenome;
	}
	public int get_dia()
	{
		return dia_nasc;
	}
	public int get_mes()
	{
		return mes_nasc;
	}
	public int get_ano()
	{
		return ano_nasc;
	}
	
	// MÉTODOS PARA CALCULAR A IDADE
	public int idade ()
	{
		return (Calendar.getInstance().get(Calendar.YEAR) - ano_nasc);
	}
	
	//MÉTODOS PARA CALCULAR A FREQUENCIA CARDIACA
	 public int freq_max ()
	 {
		 int maximo = 220 - idade();
		 return maximo;
	 }
	public int freq_ideal_min ()
	{
		int ideal = (freq_max() * 5)/10;
		return ideal;
	}
	public int freq_ideal_max ()
	{
		int ideal = (freq_max() * 8)/10;
		return ideal;
	}
}

package tratamento_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

  public static void dividir(Scanner ler)
  throws InputMismatchException, ArithmeticException
  {
    System.out.println("Digite o primeiro numero");
    int a = ler.nextInt();
    System.out.println("Digite o divisor");
    int b = ler.nextInt();
    System.out.println(a / b);
  }
  
  public static void main(String[] args) {
    /*Divisao por zero tratada com o try catch*/
    
    boolean erro = true;
    Scanner ler = new Scanner(System.in);
    
    do {
      try
      {
        dividir(ler);
        erro = false;
      }
      catch(ArithmeticException | InputMismatchException erro1)
      {
        System.err.println("Numero Inválido");
        ler.nextLine();// Descarta a entrada que deu erro
      }
      finally
      {
        System.out.println("Finally executa com ou sem tratamento");
      }
    }while(erro);    
    ler.close();
  }
}

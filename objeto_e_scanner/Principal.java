package objeto_e_scanner;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args)
  {
    String nome;
    float peso;
    
    Scanner ler = new Scanner(System.in);
    Cachorro viraLata = new Cachorro();
    
    System.out.println("Insira a raça do cachorro: ");
    nome = ler.nextLine();
    viraLata.setRaca(nome);
    
    System.out.println("Insira o nome do cachorro: ");
    nome = ler.nextLine();    
    viraLata.setNome(nome);
    
    System.out.println("Insira o peso do cachorro: ");
    peso = ler.nextFloat();    
    viraLata.setPeso(peso);
    
    nome = viraLata.toString();
    System.out.println(nome);
    viraLata.latir();
    
    System.out.println("Insira um caractere: ");
    //letra = (char)System.in.read();
    //System.out.println("A letra digitada foi: " + letra);
    
   ler.close();
  }
}

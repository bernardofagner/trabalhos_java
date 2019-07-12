package interfaces;

/*Conceitos aprendidos
Interface, herança múltipla, relacionamento de tipos dispares,

*/  

public class Principal
{  
  public static void area(AreaCalculavel a)
  {
    System.out.println(a.calculaArea());
  }
  
  public static void area(Quadrado a)
  {
    System.out.println(a.calculaArea());
  }
  
  public static void main(String[] args)
  {
    Quadrado quad = new Quadrado(2);
    AreaCalculavel a = quad;
    area(a);
    area(quad);
    area(new Quadrado(3));
    
    System.out.println("Classe principal");
  }
}

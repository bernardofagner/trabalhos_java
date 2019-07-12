package enumeracoes;

public class EnumMain
{
  public static final double PI = 3.14;
      
  public static void main(String[] args)
  {
    // Exibe a constante BISPO, do tipo enum
    System.out.println(PecasXadrez.BISPO);
    System.out.println(Medida.M.titulo);
    
    for (Medida m:Medida.values())
    {
      System.out.println(m + ": " + m.titulo);
    }
  }
}

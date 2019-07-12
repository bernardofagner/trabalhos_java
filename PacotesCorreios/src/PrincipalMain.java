public class PrincipalMain 
{
  public static void main(String[] args)
  {
    double custoTotal = 0.;
    
    Endereco remetente1 = new Endereco("Viçosa", "Cabanas", "Mariana",
                                      "Minas Gerais", "35420-000", "Casa", 90);
    Endereco remetente2 = new Endereco("Diamantina", "Chacara", "Mariana",
                                       "Minas Gerais", "35420-000", "Casa", 10);
    Endereco destinatario1 = new Endereco("Piaui", "Rosário", "Mariana",
                                         "Minas Gerais", "35420-000", "Apartamento",
                                         150);
    Endereco destinatario2 = new Endereco("Jacarandá", "Colina", "Mariana",
                                          "Minas Gerais", "35420-000", "Apartamento",
                                          240);
    
    Pacote doisDias = new PacoteDoisDias(2.0, remetente1, destinatario1,
                                         3.0, 20.0);
    Pacote noturno = new PacoteNoturno(2.0, remetente2, destinatario2,
                                       3.0, 20.0);
    
    Pacote[] pac = new Pacote[2];
    
    pac[0] = doisDias;
    pac[1] = noturno;
    
    for(int i = 0 ; i < 2 ; i++)
    {
      System.out.println("REMETENTE:");
      System.out.println(pac[i].rementente.toString());
      System.out.println("DESTINATARIO:");
      System.out.println(pac[i].destinatario.toString());
      System.out.println("Custo do envio pacote " + (i+1) + ": R$" +
                         pac[i].calculaCusto() + "\n");
      custoTotal += pac[i].calculaCusto();
    }
    
    System.out.println("Custo total do envio: R$" + custoTotal);
    
    
  }

}

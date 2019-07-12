public class Pacote
{
  Endereco rementente;
  Endereco destinatario;
  double pesoPacote;
  double custoKg;
  
  public double getPesoPacote() {
    return pesoPacote;
  }
  public void setPesoPacote(double pesoPacote)
  {
    if (pesoPacote < 0.)
    {
      this.pesoPacote = pesoPacote;
    }
    else
    {
      System.out.println("Insira um valor positivo");
    }
  }
  public double getCustoKg() {
    return custoKg;
  }
  public void setCustoKg(double custoKg)
  {
    if (custoKg < 0.)
    {
      this.custoKg = custoKg;
    }
    else
    {
      System.out.println("Insira um valor positivo");
    }
    
  }
  
  /*Retorna o custo do envio*/
  double calculaCusto()
  {
    return this.custoKg * this.pesoPacote;
  }
  
  public Pacote(){}
  
  public Pacote(Endereco rementente, Endereco destinatario, double pesoPacote,
                double custoKg)
  {
    this.rementente = rementente;
    this.destinatario = destinatario;
    this.pesoPacote = pesoPacote;
    this.custoKg = custoKg;
  }
  
  
  
}


public class PacoteDoisDias extends Pacote
{
  double taxaFixa = 2.0;
  
  PacoteDoisDias (double taxaFixa, Endereco remetente, Endereco destinatario,
                  double custoKg, double pesoPacote)
  {
    this.taxaFixa = taxaFixa;
    this.destinatario = destinatario;
    this.rementente = remetente;
    this.custoKg = custoKg;
    this.pesoPacote = pesoPacote;
  }
  public double getTaxaFixa() {
    return taxaFixa;
  }
  public void setTaxaFixa(double taxaFixa) {
    this.taxaFixa = taxaFixa;
  }
  
  @Override
  double calculaCusto()
  {
    return this.custoKg * this.pesoPacote + this.taxaFixa;
  }
}


public class PacoteNoturno extends Pacote
{
  double taxaAdicional = 1.0;

  PacoteNoturno (double taxaAdicional, Endereco remetente, Endereco destinatario,
      double custoKg, double pesoPacote)
  {
    this.taxaAdicional = taxaAdicional;
    this.destinatario = destinatario;
    this.rementente = remetente;
    this.custoKg = custoKg;
    this.pesoPacote = pesoPacote;
  }

  public double getTaxaAdicional() {
    return taxaAdicional;
  }

  public void setTaxaAdicional(double taxaAdicional) {
    this.taxaAdicional = taxaAdicional;
  }

  public PacoteNoturno(double taxaAdicional) {
    super();
    this.taxaAdicional = taxaAdicional;
  }

  @Override
  double calculaCusto()
  {
    return this.custoKg * this.pesoPacote * this.taxaAdicional;
  }
}

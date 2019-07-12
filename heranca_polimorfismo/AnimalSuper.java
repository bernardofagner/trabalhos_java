package heranca_polimorfismo;

public class AnimalSuper
{
  String nome;
  float peso;
  String tipoComida;
  
  public AnimalSuper(String nome, float peso, String tipoComida)
  {
    super();
    this.nome = nome;
    this.peso = peso;
    this.tipoComida = tipoComida;
  }

  public void fazerBarulho()
  {
    System.out.println("Barulho do animal!!!");
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public String getTipoComida() {
    return tipoComida;
  }

  public void setTipoComida(String tipoComida) {
    this.tipoComida = tipoComida;
  }
}

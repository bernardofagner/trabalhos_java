package objeto_e_scanner;

public class Cachorro
{
  private String raca;
  private String nome;
  private float peso;
  
  public String getRaca() {
    return raca;
  }
  public void setRaca(String raca) {
    this.raca = raca;
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
  public void latir()
  {
    System.out.println("Au ");
  }
  
  @Override
  public String toString() {
    return "Cachorro \n" +
            "Raça: " + raca + "\n" + "nome: " + nome + "\n" + "peso: " +
            peso;
  }

}

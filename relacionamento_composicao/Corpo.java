package relacionamento_composicao;

public class Corpo
{
  private String nome;
  private String sexo;
  private int idade;
  Coracao coracao; // Inclui uma variável do tipo Coração
  
  // Construtor da classe Corpo
  public Corpo(String nome, String sexo, int idade) {
    this.nome = nome;
    this.sexo = sexo;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  public Coracao getCoracao() {
    return coracao;
  }
  public void setCoracao(Coracao coracao) {
    this.coracao = coracao;
  }  
}

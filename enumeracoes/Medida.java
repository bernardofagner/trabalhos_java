package enumeracoes;

public enum Medida
{
  MM("Metro"), CM("Centímetro"), M("Metro");
  public String titulo;
  // Cria o construtor para a enumeração
  private Medida(String titulo)
  {
    this.titulo = titulo;
  }  
}

package heranca_polimorfismo;

public class Cachorro extends AnimalSuper
{
  float velCorrida;
  
  // Inicializa o construtor de Coruja e adiciona um atributo
  public Cachorro(float velCorrida)
  {
    super("Toto", 4.50f, "Ração");
    this.velCorrida = velCorrida;
  }
  @Override
  public void fazerBarulho()
  {
    System.out.println("Au au au!!!");
  }
}

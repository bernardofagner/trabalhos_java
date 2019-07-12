package heranca_polimorfismo;

public class Coruja extends AnimalSuper
{
  float velVoo;
  
  // Inicializa o construtor de Coruja e adiciona um atributo
  public Coruja(float velVoo)
  {
    super("Hohoth", 3.2f, "Sapos");
    this.velVoo = velVoo;
  }
  @Override
  public void fazerBarulho()
  {
    System.out.println("Ho ho hoho...");
  }
}

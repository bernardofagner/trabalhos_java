package heranca_polimorfismo;

public class Galinha extends AnimalSuper
{
  short ovos;
  
  //Inicializa o construtor de Coruja e adiciona um atributo
  public Galinha(short ovos)
  {
    super("Cocota", 1.5f, "Milho");
    this.ovos = ovos;
  }
  @Override
  public void fazerBarulho()
  {
    System.out.println("Co co co rico!!!");
  }
}

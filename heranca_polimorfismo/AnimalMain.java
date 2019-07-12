package heranca_polimorfismo;

public class AnimalMain {

  public static void main(String[] args)
  {
    AnimalSuper baby = new Cachorro(15.0f);
    System.out.println("Nome do cachorro: " + baby.getNome());
    baby.fazerBarulho();
    baby.setNome("Baby");
    System.out.println("Novo Nome é: " + baby.getNome());
  }
}

package relacionamento_composicao;

public class SerHumano
{
  public static void main(String[] args)
  {
    // Instancia um objeto Humano01 da Classe corpo
    Corpo homen01 = new Corpo("Fagenr", "Masc",26);
    //Instancia um objeto da classe Coração e o inicializa
    Coracao coracao01 = new Coracao(70, 12, 8);
    // Adiciona o coração ao ser humano01
    //homen01.coracao = coracao01;
    homen01.coracao = new Coracao(70, 12, 8);
    // Altera o valor de um membro.
    homen01.setNome("João Bento");
    // Exibe o novo nome (João Bento)
    System.out.println("Nome: " + homen01.getNome());
    // Altera o BPM
    coracao01.setBatPorMinuto(80);
    // Exibe novo BPM
    System.out.println("BPM: " + coracao01.getBatPorMinuto());
    homen01.coracao.setBatPorMinuto(100);
  }
}

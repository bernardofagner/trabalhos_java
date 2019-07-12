package relacionamento_composicao;

public class Coracao
{
  private int batPorMinuto;
  private int minPressao;
  private int maxPressao;
  
  
  // Construtor da classe
  public Coracao(int batPorMinuto, int minPressao, int maxPressao)
  {
    this.batPorMinuto = batPorMinuto;
    this.minPressao = minPressao;
    this.maxPressao = maxPressao;
  }
  public int getBatPorMinuto() {
    return batPorMinuto;
  }
  public void setBatPorMinuto(int batPorMinuto) {
    this.batPorMinuto = batPorMinuto;
  }
  public int getMinPressao() {
    return minPressao;
  }
  public void setMinPressao(int minPressao) {
    this.minPressao = minPressao;
  }
  public int getMaxPressao() {
    return maxPressao;
  }
  public void setMaxPressao(int maxPressao) {
    this.maxPressao = maxPressao;
  } 
}
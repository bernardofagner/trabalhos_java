package interfaces;

public class Quadrado implements AreaCalculavel{

  double lado;
  
  public Quadrado(double lado) {
    this.lado = lado;
  }

  @Override
  public double calculaArea() {
    return lado * lado;
  }
}

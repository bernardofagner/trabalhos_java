package interfaces;

public class Cubo implements VolumeCalculavel, AreaCalculavel{

  double lado;  
  public Cubo(double lado)
  {
    this.lado = lado;
  }
  
  @Override
  public double calculaVolume() {
    return 6 * lado * lado;
  }

  @Override
  public double calculaArea() {
    return lado * lado * lado;
  }
}

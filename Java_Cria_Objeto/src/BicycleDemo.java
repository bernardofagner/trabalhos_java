public class BicycleDemo 
{
	/*O operador new permite a criação de um objeto de uma classe. O operador 
	 *ponto indica que uma operação será realizada com aquele objeto. Como os
	 *atributos da classe "Bycicle " são públicos, os mesmos estão visiveis
	 *(podem ser acessados) a esta classe.
	 */
    public static void main(String[] args) 
    {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();	// Cria um objeto usando a classe Bycicle. (Como alocar memoria para um tipo de struct)
        Bicycle bike2 = new Bicycle();	// Cria um objeto usando a classe Bycicle. (Como alocar memoria para um tipo de struct)

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);		// Realiza a operação changeCadence para aumentar o valor do objeto bike1 em 50
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();			// Exibe as informações dos atributos do objeto bike1

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();			// Exibe as informações dos atributos do objeto bike1
    }
}
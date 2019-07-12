
public class Bicycle 
{
	/*
	 * Criar um objeto chamado bicicleta com certos atributos e operações relacionadas À aquele objeto.
	 * As operações relacionadas ao atributo geralmente ficam na mesma classe dos atributos do objeto 
	 */
	
	// Declaração dos atributos da classe (variáveis de instância)
    int cadence = 0;			// Campo do objeto Bycicle
    int speed = 0;				// Campo do objeto Bycicle
    int gear = 1;				// Campo do objeto Bycicle
    
    // Método para mudar o valor do atributo CADENCIA do objeto
    void changeCadence(int newValue) {
         cadence = newValue;
    }
    // Método para mudar o valor do atributo GEAR do objeto
    void changeGear(int newValue) {
         gear = newValue;
    }
    // Método para aumentar o valor do atributo SPEED do objeto
    void speedUp(int increment) {
         speed = speed + increment;   
    }
    // Método para diminuir o valor do atributo SPEED do objeto
    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }
    // Método para exibir o valor de cada atributo do objeto
    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
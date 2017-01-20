package objects;

public interface Consumable {

	/**
	 * Return state of Consumable
	 */
	int getState();
	
	/**
	 * Return True if State = 0
	 */
	boolean isEmpty();
	
	/**
	 * Subtract something to Consumable to consumable state 
	 */
	void use();
	
	
}

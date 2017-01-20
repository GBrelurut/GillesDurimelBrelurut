package caracters;

import objects.AbstractArmor;
import objects.AbstractObject;

public interface EquipementI {
	
	/**
	 * Test for null element
	 * @param s (String) : place to test
	 * @return 1 if an object is assigned
	 */
	public boolean isEmpty(String s);
	
	// Getters
	public AbstractArmor getHead();
	public AbstractArmor getChest();
	public AbstractArmor getArms();
	public AbstractArmor getLegs();
	
	public AbstractObject getLRing();
	public AbstractObject getRRing();
	public AbstractObject getPendant();
	
	// Setters
	public void setHead();
	public void setChest();
	public void setArms();
	public void setLRing();
	public void setRRing();
	public void setPendant();
	
	// add element (place defined by type), use setter
	public void add();
	
	// remove element (place defined by type), use setter
	public void remove();
	

}

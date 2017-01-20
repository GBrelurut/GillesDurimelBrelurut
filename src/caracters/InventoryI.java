package caracters;

import objects.AbstractArmor;
import objects.AbstractProjectile;
import objects.AbstractWeapon;
import objects.Stack;

public interface InventoryI {
	
	/**
	 * Add armor to inventory
	 * @param armor : armor object to add in inventory
	 */
	void add(AbstractArmor armor);
	
	/**
	 * Add weapon to inventory
	 * @param weapon : weapon to add in inventory
	 */
	void add(AbstractWeapon weapon);
	
	/**
	 * Add projectile to inventory
	 * @param weapon : projectile to add in inventory
	 */
	void add(AbstractProjectile weapon);
	
	/**
	 * Add projectile stack to inventory
	 * @param weapon : projectile stack to add in inventory
	 */
	void add(Stack<AbstractProjectile> stack);
}

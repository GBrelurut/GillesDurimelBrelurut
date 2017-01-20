package caracters;

import java.util.ArrayList;

import objects.AbstractArmor;
import objects.AbstractObject;
import objects.AbstractProjectile;
import objects.AbstractWeapon;
import objects.Stack;

public class Inventory implements InventoryI {
	
	private int maxWeight = 0;
	private int currentWeight = 0;
	private ArrayList<AbstractArmor> armors;
	private ArrayList<AbstractObject> weapons;
	
	@Override
	public void add(AbstractArmor armor) {
		armors.add(armor);	
		this.setCurrentWeight(this.getCurrentWeight() + armor.getWeight());
	}
	@Override
	public void add(AbstractWeapon weapon) {
		weapons.add(weapon);
		this.setCurrentWeight(this.getCurrentWeight() + weapon.getWeight());
	}
	
	@Override
	public void add(AbstractProjectile weapon) {
		weapons.add(weapon);
		this.setCurrentWeight(this.getCurrentWeight() + weapon.getWeight());
	}
	@Override
	public void add(Stack<AbstractProjectile> stack) {
		weapons.add(stack);
		this.setCurrentWeight(this.getCurrentWeight() + stack.getWeight());		
	}
	
	public int getMaxWeight() {
		return maxWeight;
	}
	
	private void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	private int getCurrentWeight() {
		return currentWeight;
	}
	
	private void setCurrentWeight(int currentWeight) {
		this.currentWeight = currentWeight;
	}
	
	Inventory() {
		setMaxWeight(0);
		setCurrentWeight(0);
	}
}

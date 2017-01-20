package caracters;

import objects.AbstractArmor;
import objects.AbstractObject;

class Equipement implements EquipementI {
	
	private AbstractArmor head;
	private AbstractArmor chest;
	private AbstractArmor arms;
	private AbstractArmor legs;
	
	private AbstractObject leftRing;
	private AbstractObject rightRing;
	private AbstractObject pendant;
	
	@Override
	public boolean isEmpty(String s) {
		if ( s == "head") return head == null;
		if ( s == "chest") return chest == null;
		if ( s == "arms") return arms == null;
		if ( s == "legs") return legs == null;
		if ( s == "leftRing") return leftRing == null;
		if ( s == "rightRing") return rightRing == null;
		if ( s == "pendant") return pendant == null;
		return false;
	}
	@Override
	public AbstractArmor getHead() {
		return head;
	}
	@Override
	public AbstractArmor getChest() {
		return chest;
	}
	@Override
	public AbstractArmor getArms() {
		return arms;
	}
	@Override
	public AbstractArmor getLegs() {
		return legs;
	}
	@Override
	public AbstractObject getLRing() {
		return leftRing;
	}
	@Override
	public AbstractObject getRRing() {
		return rightRing;
	}
	@Override
	public AbstractObject getPendant() {
		return pendant;
	}
	@Override
	public void setHead() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setChest() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setArms() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setRRing() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPendant() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setLRing() {
		// TODO Auto-generated method stub
		
	}

}

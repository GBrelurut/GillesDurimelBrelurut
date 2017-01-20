package caracters;

public abstract class AbstractFightingCaracter extends AbstractCaracter implements FightingI {
	
	protected int level;
	protected int life;
	
	protected String name;
	protected Equipement equipement;
	protected Inventory inventory;
	protected String portrait;
	
	protected int defense;
	protected int attack;
	protected int dodging;
	protected int speed;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Equipement getEquipement() {
		return equipement;
	}

	@Override
	public Inventory getInventory() {
		return inventory;
	}

	@Override
	public int getSpeed() {
		return speed;
	}
	
	@Override
	public int getLevel() {
		return level;
	}

	@Override
	public int getLife() {
		return life;
	}

	@Override
	public int getDefense() {
		return defense;
	}

	@Override
	public int getAttack() {
		return attack;
	}

	@Override
	public int getDodging() {
		return dodging;
	}
	
	@Override
	public void attack( AbstractFightingCaracter c) {
		// Draw dogging or not
		
		// Calculate c defense
		
		// Calculate this attack
		
		// Set c life = c.life - (this.attack-c.defense)
		
		
	}

}

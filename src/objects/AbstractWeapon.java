package objects;

public class AbstractWeapon extends AbstractObject implements Consumable {
	
	private int damages;
	private int state;
	
	@Override
	public int getState() {
		return state;
	}
	@Override
	public boolean isEmpty() {
		return (state == 0);
	}
	
	@Override
	public void use() {
		state--;	
	}
	
	public void use(int a) {
		state-= a;
	}
	
	/**
	 * Return damages of weapon
	 */
	public int getDamages() {
		return damages;
	}
	
	

}

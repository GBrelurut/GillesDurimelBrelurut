package objects;

public abstract class AbstractArmor extends AbstractObject implements Consumable {

	private int protection;
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
		state -= a;
	}
	
	public int getProtection() {
		return protection;
	}
}

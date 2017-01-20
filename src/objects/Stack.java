package objects;


public class Stack<T> extends AbstractObject 
	implements Consumable {
	
	private Stackable type;
	private int state;
	
	@Override
	public void use() {
		state--;
	}
	
	@Override
	public int getState() {
		return state;
	}

	@Override
	public boolean isEmpty() {
		return (state == 0);
	}
	
	public Stackable getStackable() {
		return type;
	}
	
	void add(ObjectsI o) {
		if ( type == o ) state++;
	}
	
	void add(Stack<Stackable> s) {
		if (type == s.type) state = state + s.state;
	}

	

	Stack(AbstractObject o) {
		this.setWeight(this.getWeight() + o.getWeight());
		
	}

}

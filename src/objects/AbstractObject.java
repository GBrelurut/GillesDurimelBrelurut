package objects;

public abstract class AbstractObject implements ObjectsI{
	
	private String name;
	private int weight;
	private int value;
	
	@Override
	public int getWeight() {
		return weight;
	}
	
	@Override
	public int getValue() {
		return value;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
}

package objects;

public interface ObjectsI {

	/** Return weight attribute of the object */
	public int getWeight();
	
	/** Return value attribute of the object */
	public int getValue();
	
	/** Return name of the object */
	String getName();
	
	/** setter for weight */
	public void setWeight(int weight);
	
	/** setter for value */
	public void setValue(int value);
	
	/** setter for name */
	public void setName(String name);
}

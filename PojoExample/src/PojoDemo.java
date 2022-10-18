
/**
 	A simple class is the best way to know 
 	Pojo class. 
 */
import java.io.Serializable;

public class PojoDemo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private long phone;
	
	//No argument constructor
	//usually say default constructor
	public PojoDemo() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPhone() {
		return phone;
	}
	
	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return " Here is your Info: \n id = " + id + "\n name = " + name + "\n phone = " + phone + "]";
	}

	
}

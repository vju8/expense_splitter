import java.util.List; 


public class Spending {
	private String description;
	private float amount;
	private User payer;
	private List<User> users_involved; 
	
	// constructor
	public Spending(String description, float amount, User payer, List<User> users_involved) {
		this.description = description;
		this.amount = amount; 
		this.payer = payer; 
		this.users_involved = users_involved;
	}
	
	// getter method
	public String get_description() {
		return description;
	}

	// getter method
	public float get_amount() {
		return amount;
	}
	
	// getter method
	public User get_payer() {
		return payer;
	}

	// getter method
	public List<User> get_users_involved() {
		return users_involved;
	}
}

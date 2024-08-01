import java.util.HashMap;
import java.util.Map;


public class User {
	private String username;
	private Map<User, Double> balances;

	// constructor
	public User(String username) {
		this.username = username;
		this.balances = new HashMap<>();
	}

	// getter method
	public String get_username() {
		return username;
	}
	
	// getter method
	public Map<User, Double> get_balances() {
		return balances;
	}

	// instance method to update user balances
	public void updateBalance(User otherUser, double amount) {
        balances.put(otherUser, balances.getOrDefault(otherUser, 0.0) + amount);
    }

	// override toString() method
	@Override
    public String toString() {
		return username;
	}

	// instance method to display the amounts owed or to be received for each user
	public String getDetailedBalances() {
        StringBuilder result = new StringBuilder(username + " balances:\n");
        for (Map.Entry<User, Double> entry : balances.entrySet()) {
			double balance = entry.getValue();
			if(balance<0) {
				result.append("  - receives from " + entry.getKey().username + ": " + String.format("%.2f $", Math.abs(entry.getValue())) + "\n");
			} else if (balance>0) {
				result.append("  - owes " + entry.getKey().username + ": " + String.format("%.2f $", entry.getValue()) + "\n");
			}
        }
        return result.toString();
    }
}

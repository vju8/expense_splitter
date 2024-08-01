import java.util.ArrayList;
import java.util.List;


public class Group {
	String group_name;
	List<User> group_users;
	List<Spending> group_spendings;

	// constructor
	public Group(String group_name) {
		this.group_name = group_name;
		this.group_users = new ArrayList<User>();
		this.group_spendings = new ArrayList<Spending>();
	}
	
	// instance method to add user to group
	public void add_user(User user) {
		group_users.add(user);
	}
	
	// instance method to add spending to group
	public void add_spending(Spending spending) {
		group_spendings.add(spending);
		distributeExpense(spending);
	}
	
	// instance method to distribute spending according to users involved
	private void distributeExpense(Spending spending) {
        double amountPerUser = spending.get_amount() / spending.get_users_involved().size();
        for (User user : spending.get_users_involved()) {
            if (!user.equals(spending.get_payer())) {
                user.updateBalance(spending.get_payer(), amountPerUser);
                spending.get_payer().updateBalance(user, -amountPerUser);
            }
        }
    }

	// instance method to calculate total amount spent by group
	public float calc_tot_group_amt() {
		float tot_amt = 0.0f;
		for(int i=0; i<group_spendings.size(); i++) {
			tot_amt += group_spendings.get(i).get_amount();
		}
		return tot_amt;
	}
	
	// instance method to display all group users
	public void show_group_users() {
		System.out.println("The group " + "'" + group_name + "'" + " has following participants:");
		for(User user:group_users) {
			System.out.println("- " + user.get_username());
		}
	}

}

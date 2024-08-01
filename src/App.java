import java.util.Arrays;

public class App {
	
	public static void main(String[] args) {
		// create the Group instance object
		Group group = new Group("Awesome Vacation");
		
		// create the User instance objects
		User john = new User("John"); 
		User tim = new User("Tim"); 
		User jamal = new User("Jamal"); 
		
		// add users to group
		group.add_user(john);
		group.add_user(tim);
		group.add_user(jamal);
		
		// display all group users
		group.show_group_users();
		
		// create the Spending instance objects
		Spending hotel = new Spending("Hotel", 100.00f, john, Arrays.asList(john, tim, jamal));
		Spending food = new Spending("Food", 50.00f, john, Arrays.asList(john, jamal));
		Spending bar = new Spending("Bar", 50.00f, jamal, Arrays.asList(tim, jamal));

		// add the spendings to group
		group.add_spending(hotel);
		group.add_spending(food);
		group.add_spending(bar);
		
		// calculate the total amount spent in group
		System.out.println(group.calc_tot_group_amt());		
		
		// print detailed user balances (main application functionality)
        Splitter.printBalances(group);

		// check attributes of Spending class instance bar
		System.out.println(bar.get_payer());
		System.out.println(String.format("%.2f", bar.get_amount()) + " $");
		System.out.println(bar.get_users_involved());
	}
	
}

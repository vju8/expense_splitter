
public class Splitter {
    
    // static method of Splitter class
    public static void printBalances(Group group) {
        for (User user : group.group_users) {
            System.out.println(user.getDetailedBalances());
        }
    }
}

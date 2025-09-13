import java.util.ArrayList;
public class addressBook {


    private ArrayList<buddyInfo> buddies;

    // Constructor initializes the collection
    public void AddressBook() {
        buddies = new ArrayList<>();
    }

    // Add a buddy to the list
    public void addBuddy(buddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    // Remove a buddy from the list
    public void removeBuddy(buddyInfo buddy) {
        buddies.remove(buddy);
    }


    public static void main(String[] args){

        System.out.println("Address Book");

    }
}


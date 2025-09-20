import java.util.ArrayList;
public class addressBook {


    private ArrayList<buddyInfo> buddies;

    // Constructor initializes the collection
    public addressBook() {
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

//main function that removed and adds buddy
    public static void main(String[] args){

        System.out.println("Address Book");
        buddyInfo buddy = new buddyInfo("Tom", "Carleton", "6133333333");
        addressBook buddies = new addressBook();
        buddies.addBuddy(buddy);
        buddies.removeBuddy(buddy);
        System.out.println("TEST COMPLETE");
    }
}


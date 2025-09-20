public class buddyInfo {

    private String name;
    private String phone;
    private String address;

    // Constructor with parameters
    public buddyInfo(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    // Default constructor (avoid duplication by calling the other constructor)
    public buddyInfo() {
        this("Kalid", "123-567-7890", "111 Wellington Street");
    }

    // Getter for name
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Instantiate a buddyInfo object with the name "Homer"
        buddyInfo buddy = new buddyInfo("Homer", "123-456-7890", "742 Evergreen Terrace");

        // Print greeting using the getter
        System.out.println("Hello " + buddy.getName());
    }
}
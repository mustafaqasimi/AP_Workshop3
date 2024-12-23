public class Contact {
    private String firstName;
    private String lastName;
    private String group;
    private String email;
    private PhoneNumber phoneNumber;
    private Address address;
    public Contact(){
        this.firstName = "";
        this.lastName = "";
        this.group = "";
        this.email = "";
        this.phoneNumber = new PhoneNumber();
        this.address = new Address();
    }
    public Contact(String firstName, String lastName, String group, String email, PhoneNumber phoneNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getGroup() {
        return group;
    }
    public String getEmail() {
        return email;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGroup(String group) {
            this.group = group;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address=" + address +
                '}';
    }
}

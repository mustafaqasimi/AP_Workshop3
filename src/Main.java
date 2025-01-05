import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();

        Scanner scanner = new Scanner(System.in);
        String[] command;
        while (true) {
            System.out.println("Enter command: ");
            command = scanner.nextLine().split(" ");
            if (command.length == 1 && command[0].equals("exit"))
                break;

            else if (command.length == 4) {
                if (command[0].equals("contacts") && command[1].equals("-a")) {
                    Contact contact = new Contact();
                    contact.setFirstName(command[2]);
                    contact.setLastName(command[3]);
                    System.out.print("Enter the group: ");
                    contact.setGroup(scanner.nextLine());
                    System.out.print("Enter your email: ");
                    contact.setEmail(scanner.nextLine());
                    System.out.print("Enter your phone number: ");
                    PhoneNumber phoneNumber = new PhoneNumber();
                    phoneNumber.setNumber(scanner.nextLine());
                    System.out.print("Enter your country code: ");
                    phoneNumber.setCountryCode(scanner.nextLine());
                    contact.setPhoneNumber(phoneNumber);
                    System.out.print("Enter your country: ");
                    Address address = new Address();
                    address.setCountry(scanner.nextLine());
                    System.out.print("Enter your city: ");
                    address.setCity(scanner.nextLine());
                    System.out.print("Enter your zip code: ");
                    address.setZipCode(scanner.nextLine());
                    contact.setAddress(address);
                    if (pb.addContact(contact).equals("ok"))
                        System.out.println("Contact added");
                    else
                        System.out.println("Contact exists!");
                } else if (command[0].equals("contacts") && command[1].equals("-r")) {
                    Contact contact = new Contact();
                    contact.setFirstName(command[2]);
                    contact.setLastName(command[3]);
                    if (pb.removeContact(contact).equals("ok"))
                        System.out.println("Contact removed");
                    else
                        System.out.println("Contact is not found");

                } else if (command[0].equals("show") && command[1].equals("-c")) {
                    Contact contact = new Contact();
                    contact.setFirstName(command[2]);
                    contact.setLastName(command[3]);
                    contact = pb.searchContact(contact.getFirstName(), contact.getLastName());
                    if (contact != null)
                        System.out.println(contact.toString());
                    else
                        System.out.println("Contact not found");
                }

            }

            else if (command.length == 3 && command[0].equals("show") && command[1].equals("-g")) {
                String groupName = scanner.nextLine();
                pb.showGrouped(groupName);
            }

            else if (command.length == 1 && command[0].equals("show")) {
                pb.displayContacts();
            }

        }
    }
}
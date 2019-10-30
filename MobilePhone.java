import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {


        private static Scanner scanner = new Scanner(System.in);
        private static Contacts contactlist = new Contacts();

        public static void main(String[] args) {
            boolean quit = false;
            int choice;
            printInstructions();
            while (!quit) {
                System.out.println("Select and option");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        contactlist.showContacts();
                    case 2:
                        createContact();
                        break;
                    case 3:
                        deleteContact();
                        break;
                    case 4:
                        searchContacts();
                        break;
                    case 5:
                        changeContact();
                    case 6:
                        quit = true;
                        break;
                }
            }
        }

        public static void printInstructions() {
            System.out.println("\nPress ");
            System.out.println("\t 0 - To print instructions");
            System.out.println("\t 1 - To print all contacts.");
            System.out.println("\t 2 - To add a contact.");
            System.out.println("\t 3 - To remove a contact.");
            System.out.println("\t 4 - To find a contact.");
            System.out.println("\t 5 - To edit a contact.");
            System.out.println("\t 6 - To quit.");
        }
        public static void printContacts() {
            contactlist.showContacts();
        }

        public static void createContact() {
            System.out.print("Please enter the contact's name and phone number");
            contactlist.addContact(scanner.nextLine());
        }

        public static void deleteContact() {
            System.out.print("Please enter the contact to be deleted");
            int contactNumber = scanner.nextInt();
            scanner.nextLine();
            contactlist.removeContact(contactNumber);
        }

        public static void changeContact() {
            System.out.print("Enter item number to edit: ");
            int contactNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter replacement contact's name and phone number");
            String newContact = scanner.nextLine();
            contactlist.editContact(contactNumber - 1, newContact);
        }

        public static void searchContacts() {
            System.out.print("Enter contact to search for");
            String searchContact = scanner.nextLine();
            if (contactlist.inContacts(searchContact)) {
                System.out.println("Result of search: " + searchContact);
            } else {
                System.out.println(searchContact + " does not exist");
            }
       }
}


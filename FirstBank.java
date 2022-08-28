import java.util.Scanner;

public class FirstBank {
    public static void main(String[] args) {

        // Create a static Account for customers
        // Account Corey = new Account("Corey Barron", "A00001");
        // Corey.showMenu();

        // Instead, create a dynamic Account for customers
        Scanner input = new Scanner(System.in);

        System.out.println("Create an account with FirstBank!");
        System.out.print("Enter your name: ");
        String createName = input.nextLine();
        System.out.println();

        System.out.print("Enter your ID: ");
        String createAccountID = input.nextLine();
        System.out.println();

        String user = createName;

        // Print only the first name for welcome, if applicable
        if (createName.contains(" "))
            user = createName.substring(0, createName.indexOf(" "));

        Account customer = new Account(user, createAccountID);
        customer.showMenu();

    }

}
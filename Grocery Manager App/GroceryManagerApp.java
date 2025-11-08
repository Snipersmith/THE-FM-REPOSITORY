import java.util.Scanner;

public class GroceryManagerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String groceryList = ""; 

        while (true) {
            System.out.println(">>>>>>> Grocery Manager App <<<<<<<");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Show all items");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String itemToAdd = input.nextLine().trim();
                    if (!itemToAdd.isEmpty()) {
                        groceryList += itemToAdd + ";";
                        System.out.println("'" + itemToAdd + "' added to list.");
                    } else {
                        System.out.println("Item name cannot be empty!");
                    }
                    break;

                case 2:
                    System.out.print("Enter item to remove: ");
                    String itemToRemove = input.nextLine().trim();
                    if (groceryList.contains(itemToRemove + ";")) {
                        groceryList = groceryList.replace(itemToRemove + ";", "");
                        System.out.println("'" + itemToRemove + "' removed from list.");
                    } else {
                        System.out.println("'" + itemToRemove + "' not found in list.");
                    }
                    break;

                case 3:
                    if (groceryList.isEmpty()) {
                        System.out.println("Your grocery list is empty.");
                    } else {
                        System.out.println("Your Grocery List:");
                        String[] items = groceryList.split(";");
                        for (int i = 0; i < items.length; i++) {
                            System.out.println((i + 1) + ". " + items[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println(" Exiting Grocery Manager. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Please enter 1–4.");
            }
        }
    }
}



import java.util.Scanner;

public class LibraryTrackerApp {
public static void main (String [] args){

Scanner input = new Scanner(System.in);
String books = "The subtle art of not giving a fuck-available;Rich dad Poor dad-available;";

        while (true) {
            System.out.println("\n>>>>>>> Library Tracker App <<<<<<<");
            System.out.println("1. View all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = input.nextInt();
            input.nextLine();

       switch (choice) {
                case 1:
                  
                    if (books.isEmpty()) {
                        System.out.println("No books available in the library.");
                    } else {
                        System.out.println("Books in the Library:");
                        String[] bookList = books.split(";");
                        for (int index = 0; index < bookList.length; index++) {
                            if (!bookList[index].isEmpty()) {
                                String[] parts = bookList[index].split("-");
                                System.out.println((index + 1) + ". " + parts[0] + " (" + parts[1] + ")");
                            }
                        }
                    }
                    break;


                case 2:
                    System.out.println("\nEnter the number of the book to borrow:");
                    String[] borrowList = books.split(";");
                    for (int index = 0; index < borrowList.length; index++) {
                        if (!borrowList[index].isEmpty()) {
                            String[] parts = borrowList[index].split("-");
                            System.out.println((index + 1) + ". " + parts[0] + " (" + parts[1] + ")");
                        }
                    }


                    int borrowChoice = input.nextInt();
                    input.nextLine();


                    if (borrowChoice > 0 && borrowChoice <= borrowList.length) {
                        String selected = borrowList[borrowChoice - 1];
                        String[] parts = selected.split("-");
                        if (parts[1].equalsIgnoreCase("Available")) {
                            selected = parts[0] + "-Borrowed";
                            borrowList[borrowChoice - 1] = selected;
                            books = "";
                            for (String b : borrowList) {
                                if (!b.isEmpty()) books += b + ";";
                            }
                            System.out.println("'" + parts[0] + "' has been borrowed.");
                        } else {
                            System.out.println("'" + parts[0] + "' is already borrowed!");
                        }
                    } else {
                        System.out.println("Invalid book number!");
                    }
                    break;

                case 3:
                    System.out.println("\nEnter the number of the book to return:");
                    String[] returnList = books.split(";");
                    for (int index = 0; index < returnList.length; index++) {
                        if (!returnList[index].isEmpty()) {
                            String[] parts = returnList[index].split("-");
                            System.out.println((index + 1) + ". " + parts[0] + " (" + parts[1] + ")");
                        }
                    }

                    int returnChoice = input.nextInt();
                    input.nextLine();

                    if (returnChoice > 0 && returnChoice <= returnList.length) {
                        String selected = returnList[returnChoice - 1];
                        String[] parts = selected.split("-");
                        if (parts[1].equalsIgnoreCase("Borrowed")) {
                            selected = parts[0] + "-Available";
                            returnList[returnChoice - 1] = selected;
                            books = "";
                            for (String b : returnList) {
                                if (!b.isEmpty()) books += b + ";";
                            }
                            System.out.println("'" + parts[0] + "' has been returned.");
                        } else {
                            System.out.println("'" + parts[0] + "' is already available!");
                        }
                    } else {
                        System.out.println("Invalid book number!");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Please enter 1–4.");

}
}










}
}
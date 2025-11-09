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













}
}










}
}
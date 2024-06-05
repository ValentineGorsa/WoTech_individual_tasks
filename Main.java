import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int nextId = 1;

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a new book");
            System.out.println("2. Remove a book");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.print("Enter the book name: ");
                String name = scanner.nextLine();

                System.out.print("Enter the author name: ");
                String author = scanner.nextLine();

                System.out.print("Enter the publisher name: ");
                String publisher = scanner.nextLine();

                System.out.print("Enter the year of publishing: ");
                int yearOfPublishing = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Enter the count of sheets: ");
                int countOfSheets = scanner.nextInt();
                scanner.nextLine(); 

                //create a new book
                books.add(new Book(nextId, name, author, publisher, yearOfPublishing, countOfSheets));
                System.out.println("Book added successfully. ID: " + nextId);
                nextId++;

            } else if (input.equals("2")) {
                // remove a book
                System.out.print("Enter the book ID to remove: ");
                int idToRemove = scanner.nextInt();
                scanner.nextLine(); 

                boolean found = false;
                for (Book book : books) {
                    if (book.getId() == idToRemove) {
                        books.remove(book);
                        System.out.println("Book removed successfully.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Book with ID " + idToRemove + " not found in the list. Please cheack the ID.");
                }

            } else if (input.equals("3")) {
                // display all books
                System.out.println("List of books:");
                for (Book book : books) {
                    System.out.println(book);
                }

            } else if (input.equals("4")) {
                // exit
                System.out.println("Exiting the program.");
                scanner.close();
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


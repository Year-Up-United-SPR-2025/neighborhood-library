package com.pluralsight;
import java.util.Scanner;

public class Main {

   private static Scanner scanner = new Scanner(System.in);
    private static Book[] library = getPopulatedLibrary();

    public static void main(String[] args) {



        ShowScreenHome();

    }

    private static void ShowScreenHome(){

        String  homeScreenPrompt = "Welcome to the library\n" +
                "Please select an option from the following\n" +
                " 1- Show Available Books\n  " +
                "  2 - Show Checked Out Books\n  " +
                "  0- Exit App\n  " +
                "(1,2,0):";

        int option;

        do {
            System.out.print(homeScreenPrompt);
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1){
                ShowScreenAvailableBooks();
            } else if (option == 2) {
                ShowScreenCheckedOutBooks();
            }
            else if (option ==  0){
                System.out.println("Exiting the library have a nice day");
            }
            else {
                System.out.println("Not a valid option please try again");
            }
        } while (option != 0);

    }

    private  static void ShowScreenAvailableBooks(){
        System.out.println(".......todo available books menu here");
    }

    public static void ShowScreenCheckedOutBooks(){
        System.out.println("...........too checked out books here");
    }



    private static Book[] getPopulatedLibrary() {

        Book[] Library = new Book[20];
//book names id and isbn
        Library[0] = new Book(1, "9780061120084", "To Kill a Mockingbird");
        Library[1] = new Book(2, "9780451524935", "1984");
        Library[2] = new Book(3, "9780743273565", "The Great Gatsby");
        Library[3] = new Book(4, "9780141439518", "Pride and Prejudice");
        Library[4] = new Book(5, "9780316769488", "The Catcher in the Rye");
        Library[5] = new Book(6, "9780547928227", "The Hobbit");
        Library[6] = new Book(7, "9781451673319", "Fahrenheit 451");
        Library[7] = new Book(8, "9781503280786", "Moby-Dick");
        Library[8] = new Book(9, "9780141441146", "Jane Eyre");
        Library[9] = new Book(10, "9780060850524", "Brave New World");
        Library[10] = new Book(11, "9780451526342", "Animal Farm");
        Library[11] = new Book(12, "9780141439556", "Wuthering Heights");
        Library[12] = new Book(13, "9780544003415", "The Lord of the Rings");
        Library[13] = new Book(14, "9780066238500", "The Chronicles of Narnia");
        Library[14] = new Book(15, "9780439023528", "The Hunger Games");
        Library[15] = new Book(16, "9780590353427", "Harry Potter and the Sorcerer's Stone");
        Library[16] = new Book(17, "9780142424179", "The Fault in Our Stars");
        Library[17] = new Book(18, "9780062315006", "The Alchemist");
        Library[18] = new Book(19, "9780375842207", "The Book Thief");
        Library[19] = new Book(20, "9780544336261", "The Giver");

        return Library;
    }
}

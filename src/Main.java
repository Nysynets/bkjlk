import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instantiate the classes
        AgeList ageList = new AgeList();
        NamesAndSurnames namesAndSurnames = new NamesAndSurnames();
        InitialsList initialsList = new InitialsList();
        Scanner scanner = new Scanner(System.in);

        // NamesAndSurnames operations
        System.out.println("Enter a name to add:");
        String newName = scanner.nextLine();
        System.out.println("Enter a surname to add:");
        String newSurname = scanner.nextLine();
        namesAndSurnames.addEntry(newName, newSurname);

        System.out.println("Enter a name to delete:");
        String nameToDelete = scanner.nextLine();
        namesAndSurnames.deleteEntry(nameToDelete);

        System.out.println("Enter a name to search:");
        String nameToSearch = scanner.nextLine();
        namesAndSurnames.searchEntry(nameToSearch);

        namesAndSurnames.displayEntries();

        // AgeList operations
        ageList.initializeAges();
        ageList.updateAges(scanner);
        ageList.calculateAverageAge();
        ageList.countAgesOver22();
        ageList.displayAges();

        // InitialsList operations, now passing the scanner to each method
        initialsList.initializeInitials();
        initialsList.addInitial(scanner);
        initialsList.removeInitial(scanner);
        initialsList.searchInitial(scanner);
        initialsList.displayInitials();

        // Close the scanner
        scanner.close();
    }
}

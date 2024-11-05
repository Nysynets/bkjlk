import java.util.ArrayList;
import java.util.Scanner;

public class InitialsList {
    private ArrayList<Character> initials = new ArrayList<>();

    // Initialize the ArrayList with initial values
    public void initializeInitials() {
        initials.add('A');
        initials.add('B');
        initials.add('C');
        initials.add('D');
        initials.add('E');
        initials.add('F');
        initials.add('G');
        initials.add('H');
        initials.add('I');
        initials.add('J');
        System.out.println("Initial initials: " + initials);
    }

    public void addInitial(Scanner scanner) {
        System.out.print("Enter a new initial to add: ");
        char newInitial = scanner.next().charAt(0);
        initials.add(newInitial);
        System.out.println("Added initial: " + newInitial);
    }

        public void removeInitial(Scanner scanner) {
        System.out.print("Enter an initial to remove: ");
        char initialToRemove = scanner.next().charAt(0);
        if (initials.contains(initialToRemove)) {
            initials.remove(Character.valueOf(initialToRemove));
            System.out.println("Removed initial: " + initialToRemove);
        } else {
            System.out.println("Initial not found: " + initialToRemove);
        }
    }

    // Search for an initial
    public void searchInitial(Scanner scanner) {
        System.out.print("Enter an initial to search for: ");
        char initialToSearch = scanner.next().charAt(0);
        if (initials.contains(initialToSearch)) {
            System.out.println("Initial " + initialToSearch + " is present in the list.");
        } else {
            System.out.println("Initial " + initialToSearch + " is not found in the list.");
        }
    }

    // Display the current initials list
    public void displayInitials() {
        System.out.println("Current initials: " + initials);
    }
}

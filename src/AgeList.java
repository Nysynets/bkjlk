import java.util.ArrayList;
import java.util.Scanner;

public class AgeList {
    private ArrayList<Integer> ages = new ArrayList<>();

    // Initialize the ArrayList with initial values
    public void initializeAges() {
        ages.add(25);
        ages.add(30);
        ages.add(18);
        ages.add(21);
        ages.add(22);
        ages.add(35);
        ages.add(40);
        ages.add(17);
        ages.add(28);
        ages.add(19);
        System.out.println("Initial ages: " + ages);
    }

    // Update specific entries based on user input
    public void updateAges(Scanner scanner) {
        System.out.print("Enter new age for index 5: ");
        int newAge5 = scanner.nextInt();
        ages.set(5, newAge5);

        System.out.print("Enter new age for index 7: ");
        int newAge7 = scanner.nextInt();
        ages.set(7, newAge7);
    }

    // Calculate the average age of users
    public void calculateAverageAge() {
        double sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double averageAge = sum / ages.size();
        System.out.printf("Average age: %.2f%n", averageAge);
    }

    // Count the number of users over 22
    public void countAgesOver22() {
        int countOver22 = 0;
        for (int age : ages) {
            if (age > 22) {
                countOver22++;
            }
        }
        System.out.println("Number of users over 22: " + countOver22);
    }

    // Display the updated list of ages
    public void displayAges() {
        System.out.println("Updated ages: " + ages);
    }
}

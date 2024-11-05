import java.util.ArrayList;
import java.util.Scanner;

public class NamesAndSurnames {
    private ArrayList<String> names;
    private ArrayList<String> surnames;


      public NamesAndSurnames() {
        names = new ArrayList<>();
        surnames = new ArrayList<>();


        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");
        names.add("Frank");
        names.add("Grace");
        names.add("Hannah");
        names.add("Ivy");
        names.add("Jake");

        surnames.add("Johnson");
        surnames.add("Smith");
        surnames.add("Brown");
        surnames.add("Taylor");
        surnames.add("Anderson");
        surnames.add("Thomas");
        surnames.add("Jackson");
        surnames.add("White");
        surnames.add("Harris");
        surnames.add("Martin");
    }


    public void addEntry(String name, String surname) {
        names.add(name);
        surnames.add(surname);
        System.out.println(name + " " + surname + " has been added.");
    }


    public void deleteEntry(String name) {
        if (names.contains(name)) {
            int index = names.indexOf(name);
            names.remove(index);
            surnames.remove(index);
            System.out.println(name + " and their surname have been removed.");
        } else {
            System.out.println("User not found.");
        }
    }


    public void searchEntry(String name) {
        if (names.contains(name)) {
            int index = names.indexOf(name);
            String foundSurname = surnames.get(index);
            System.out.println("Found user: " + name + " " + foundSurname);
        } else {
            System.out.println("User not in the list.");
        }
    }

    public void displayEntries() {
        System.out.println("Updated list of names and surnames:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " " + surnames.get(i));
        }
    }


}

package phoneBook;

import javax.swing.*;

/**
 * @author Harut
 */
public class Runner {
    public static void main(String[] args) throws Exception {
        PhoneBook ph = new PhoneBook();
        String input, s;
        int selector;


        while (true) {
            input = JOptionPane.showInputDialog("Enter 1 to Add\nEnter 2 to Search\nEnter 3 to Delete\nEnter 4 to Exit");
            selector = Integer.parseInt(input);


            switch (selector) {
                case 1:
                    ph.addPerson();
                    break;

                case 2:
                    s = JOptionPane.showInputDialog("Enter firstname or lastname or number to search");
                    ph.searchPersons(s);
                    break;

                case 3:
                    s = JOptionPane.showInputDialog("Enter firstname or lastname to delete");
                    ph.deletePerson(s);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}

package phoneBook;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.StringConcatException;
import java.util.ArrayList;

 public class PhoneBook {
    ArrayList persons;

    PhoneBook() {
        persons = new ArrayList();
    }

    /**
     * Method adding persons in ArrayList
     */
    void addPerson()  {
        String name = JOptionPane.showInputDialog("Enter firstname: ");
        String lastName = JOptionPane.showInputDialog("Enter lastname: ");
        String mail = JOptionPane.showInputDialog("Enter  mail (example` mail, gmail, icloud or other): ");
        String type = JOptionPane.showInputDialog("Enter type of phone number: (example` worker, mobile, basic, home");
        String phoneNumber = JOptionPane.showInputDialog("Enter phone number: ");
        String secondPhoneNumber = JOptionPane.showInputDialog("If contact have second number phone add it, other enter empty");
        PersonInfo p = new PersonInfo(name, lastName, mail, type, phoneNumber, secondPhoneNumber);

        if (phoneNumber.charAt(0) == '0' && phoneNumber.length() >= 10) {
            throw new IndexOutOfBoundsException();
        }
        if (phoneNumber.charAt(0) == '+' && phoneNumber.length() >= 13) {
            throw new IndexOutOfBoundsException();
        }
        if (secondPhoneNumber.charAt(0) == '0' && secondPhoneNumber.length() >= 10) {
            throw new IndexOutOfBoundsException();
        }
        if (secondPhoneNumber.charAt(0) == '+' && secondPhoneNumber.length() >= 13) {
            throw new IndexOutOfBoundsException();
        }

        persons.add(p);
    }

    /**
     * Method searching persons from ArrayList
     * @param n
     */
    void searchPersons(String n) {
        for (int i = 0; i < persons.size(); i++) {
            PersonInfo p = (PersonInfo) persons.get(i);
            if (n.equals(p.getFirstName()) || n.equals(p.getLastName()) || n.equals(p.getPhoneNumber()) || n.equals(p.getSecondPhoneNumber()) ) {
                p.display();
            } else {
                System.out.println("The contact not found, please enter a valid firstname or lastname or phone number");
            }
        }

    }

    /**
     * Method deleting persons from ArrayList
     * @param n
     */
    void deletePerson(String n) {
        for (int i = 0; i < persons.size(); i++) {
            PersonInfo p = (PersonInfo) persons.get(i);
            if (n.equals(p.getFirstName()) || n.equals(p.getLastName())){
                persons.remove(i);
                System.out.println("Your contact has deleted successfully");
            }
            else {
                System.out.println("The contact not found, please enter a valid firstname or lastname");
            }
        }
    }
}

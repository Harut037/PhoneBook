package phoneBook;

import javax.swing.*;

 public class PersonInfo {
    private String firstName;

   private String lastName;
  private   String mail;
   private String phoneNumber;

   private String phoneNumberType;
   private String secondPhoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumberType() {
        return phoneNumberType;
    }

    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    public String getSecondPhoneNumber() {
        return secondPhoneNumber;
    }

    public void setSecondPhoneNumber(String secondPhoneNumber) {
        this.secondPhoneNumber = secondPhoneNumber;
    }

    /**
     * PersonInfo constructor
     * @param f
     * @param l
     * @param m
     * @param p
     * @param t
     */
    PersonInfo(String f, String l, String m, String t, String p, String s) {
        firstName = f;
        lastName = l;
        mail = m;
        phoneNumberType = t;
        phoneNumber = p;
        secondPhoneNumber = s;



    }


    void display() {
        JOptionPane.showMessageDialog(null, "Firstname: " + firstName + "\nLastname: " + lastName + "\nMail: " + mail  + "\nPhone number's type: " + phoneNumberType + "\nPhone number: " + phoneNumber + "\nSecond phone number: " + secondPhoneNumber);
    }
}
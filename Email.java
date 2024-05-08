package emailapp;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength = 10;
    private String email;
    private String companySufflix = "xyz.com";
    private int mailboxCapacity = 1024;
    private String alternativeEmail;
    private String changePassword;

    // Constructor  to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " +this.firstName +" " +this.lastName);

        // call a method asking for the department
        this.department = setDepartment();


        // combine element to generate Email
        email = firstName.toLowerCase() +"."+ lastName.toLowerCase()+ "@"+ department+ "."+companySufflix;


        //set the random password
        this.password = randomPassword(defaultPasswordLength);


        //temp Email
        this.alternativeEmail = getAlternativeEmail();

    }
    // Ask for the department
    private String setDepartment() {
        System.out.print(""+firstName+" "+ lastName +" enter the Department\n 1- Sales\n 2-Development\n 3-Accounts\n 4-None\n Enter Department Code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
                return "Sales";
        } else if (depChoice == 2) {
                return "Developer";
        } else if (depChoice == 3) {
                return "Accounts";
        } else {
                return "";
        }
    }
    // generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXZ!@#$%&*";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternative email
    public void setAlternativeEmail(String altEmail){
        this.alternativeEmail = altEmail;

    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }
    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternativeEmail() {return alternativeEmail; }
    public String getPassword() { return password; }


    // show the info in the single tab
    public String showinfo() {
        return "Empolyer name: " + firstName+" "+lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nTEMP PASSWORD: " + password +
                "\nTEMP EMAIL: " + alternativeEmail +
                "\nMAILBOX CAPACITY: " + mailboxCapacity+ "MB";
    }

}
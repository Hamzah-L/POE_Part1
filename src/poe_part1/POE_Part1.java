package poe_part1;

import javax.swing.JOptionPane;

public class POE_Part1 {

    public static void main(String[] args) {

        {
//Register process
            //setting parameters for the username. Must contain a underscore and must be no more then five characters
            String username = "";
            String usernamePattern = "^(?=.{1,5}$)[A-Za-z0-9_]*_[A-Za-z0-9_]*$";

            while (!username.matches(usernamePattern)) {
                username = JOptionPane.showInputDialog("Please enter a username. Must contain a underscore and must be no more then five characters");
                if (username.matches(usernamePattern)) {
                    JOptionPane.showMessageDialog(null, "Username successfully captured");
                } else {
                    JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more then five characters in lenght");
                }
            }
            //prompt user for a password
            String password = "";

            //setting parameters for the Password. Must be at least be eight characters long, contain a capital letter, contain a number,contain a special characters
            String passwordPattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!()_{}\\[\\]:;\"'<>,.?/~`|\\\\-]).{8,}$";

            while (!password.matches(passwordPattern)) {
                password = JOptionPane.showInputDialog("Please enter a password. Must be at least be eight characters long, contain a capital letter, contain a number,contain a special characters");
                if (password.matches(passwordPattern)) {
                    JOptionPane.showMessageDialog(null, "Password successfully captured");
                } else {
                    JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the passwordcontains at least eight characters, a capital letter, a number, and a special character");
                }
            }
//Prompting user for a phone number. 

            String number = "";

            //setting parameters for the phone number. Must contain the international country code followed by the number, which is no more than ten characters long
            String numberPattern = "^\\+27\\d{1,3}\\d{1,10}$";

            while (!number.matches(numberPattern)) {
                number = JOptionPane.showInputDialog("Please enter a cellphone number. Must contain the South African country code(+27) followed by the number, which is no more than ten characters long");
                if (number.matches(numberPattern)) {
                    JOptionPane.showMessageDialog(null, "Cellphone number successfully added");
                } else {
                    JOptionPane.showMessageDialog(null, "Cellphone number incorrectly formatted or does not contain international code");
                }

            }

            // Login attempt (with 3 tries allowed)
            int Attempts = 0;
            int maxAttempts = 3;
            boolean loginSuccess = false;

            while (Attempts < maxAttempts) {
                String userName = JOptionPane.showInputDialog("Login", "Please enter your username:");
                String userPassword = JOptionPane.showInputDialog("Password", "Please enter your password:");

                if (userName == null || userPassword == null) {
                    JOptionPane.showMessageDialog(null, "Login cancelled.");
                    System.exit(0);
                }

                if (userName.equals(username) && userPassword.equals(password)) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    String firstName = JOptionPane.showInputDialog("Enter your first name:");
                    String lastName = JOptionPane.showInputDialog("Enter your last name:");
                    JOptionPane.showMessageDialog(null, "Welcome, " + firstName + " " + lastName);
                    loginSuccess = true;
                    break;
                } else {
                    Attempts++;
                    JOptionPane.showMessageDialog(null, "Username or Password incorrect. Attempts remaining: " + (maxAttempts - Attempts));
                }
            }

            if (!loginSuccess) {
                JOptionPane.showMessageDialog(null, "Maximum login attempts exceeded. Access denied.");
                System.exit(0);
            }
        }
    }

}

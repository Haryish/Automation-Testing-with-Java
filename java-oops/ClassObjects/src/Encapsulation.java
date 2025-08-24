// Wrapping data (variables) and methods into a single unit.
// Data hiding is achieved using private variables + public getters/setters.

// Consider a LoginPage class with username and password fields
/*
 * Explanation: Encapsulation is a fundamental principle of Object-Oriented Programming (OOP) that involves bundling the data (attributes) and methods (functions) that operate on the data into a single unit, typically a class. This approach helps in protecting the internal state of an object from unintended interference and misuse by restricting direct access to its fields. Instead, access to these fields is provided through public methods, commonly known as getters and setters.
 * Example: In the provided code, the `LoginPage` class encapsulates the `username` and `password` fields by declaring them as private. This means that these fields cannot be accessed directly from outside the class. Instead, public getter and setter methods are provided to allow controlled access to these fields. For instance, the `getUsername()` method allows reading the username, while the `setUsername(String username)` method allows updating it. This encapsulation ensures that any logic related to setting or getting these values can be centralized within the class, such as validation or logging.
 */

class LoginPage {
    private String username;
    private String password;

    public LoginPage() { // Constructor to initialize default values
        this.username = "defaultUser"; // Default username
        this.password = "defaultPass"; // Default password
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {
        System.out.println("Logging in with " + username + " and " + password);
    }

    public void resetPassword(String username, String newPassword) {
        this.password = newPassword; // Reset password to default
        System.out.printf("Password for %s is reset to %s%n", username, newPassword); // LEARNING OUTCOME: String
                                                                                      // formatting
    }

    public void logout() {
        System.out.println("Logging out " + username);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("Encapsulation Demo");
        LoginPage loginPage = new LoginPage(); // Create an object of LoginPage
        loginPage.login();

        System.out.printf("LoginPage for %s initialized with default credentials: Password - &s",
                loginPage.getUsername(), loginPage.getPassword()); // Call login with default credentials
        loginPage.setUsername("newUser"); // Update username
        loginPage.setPassword("newPass");
        // Update password
        loginPage.login(); // Call login with updated credentials
        loginPage.resetPassword("newUser", "resetPass"); // Reset password to default
        loginPage.logout(); // Call login with updated credentials
    }
}

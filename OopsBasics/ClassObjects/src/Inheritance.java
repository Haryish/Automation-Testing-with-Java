
// Inheritance is a mechanism where a new class inherits properties and behavior (methods) from an existing class.
// It promotes code reusability and establishes a hierarchical relationship between classes.
// One class (child) can inherit properties & methods of another class (parent).

// Example: Classes that implements browser invocation can inherit common methods from a base class.

//Parent class
class TestBase {

    //constructor
    public TestBase() {
        System.out.println("Inside TestBase Constructor");
    }
    
    public void launchBrowser() {                           // Method to launch browser
        System.out.println("Launching browser");
    }

    public void closeBrowser() {
        System.out.println("Closing browser");
    }
}

// Child class inheriting from TestBase
class HomePage extends TestBase {
    public void navigateToHomePage() {
        launchBrowser();                                    // Inherited method from TestBase
        System.out.println("Navigating to Home Page");
        closeBrowser();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance Demo");
        HomePage homePage = new HomePage();                  // Create an object of HomePage
        homePage.navigateToHomePage();                       // Call method from HomePage which uses inherited methods
        System.out.println("Ended Inheritance Demo");

    }
}

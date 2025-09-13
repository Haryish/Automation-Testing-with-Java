// package concepts;

// What is Abstraction?
// Hiding internal details and showing only functionality
// Example: TV remote, Car steering

//Example scenario: WebDriver (Interface) and ChromeDriver (Implementation)
// Implementation Explanation: 
// WebDriver defines the methods (click, sendKeys) without implementation
// ChromeDriver provides the actual implementation of these methods
// This allows users to interact with WebDriver without needing to know the details of ChromeDriver
// This is abstraction in action

// Interface (Abstraction)
interface WebDriver {
    void click();

    void sendKeys(String text);
}

// Implementation
class ChromeDriver implements WebDriver {
    public void click() {
        System.out.println("Click in Chrome");
    }

    public void sendKeys(String text) {
        System.out.println("Typing in Chrome: " + text);
    }
}

public class AbstractConcept {
    public static void main(String[] args) {
        System.out.println("Abstraction Demo");
        WebDriver driver = new ChromeDriver(); // Upcasting
        driver.click();
        driver.sendKeys("Hello");
        System.out.println("Ended Abstraction Demo");
    }
}
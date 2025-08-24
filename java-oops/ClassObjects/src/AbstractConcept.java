// package concepts;
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
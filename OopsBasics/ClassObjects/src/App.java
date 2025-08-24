// Demonstration of Class Object Creation and Method Invocation in Java

// Define a simple class with a method
// Class is defined outside the main class
class TestCase{
    String testName;                                            // Instance variable

    void executeTest()                                          // Method to execute the test
    {
        System.out.println("Executing test: " + testName);
    }
}

public class App {                                              // Main class
    public static void main(String[] args) throws Exception {   // Main method
        TestCase testCase = new TestCase();                     // Creating an object of TestCase class

        testCase.testName = "First Test Case";                  // Setting the testName variable

        testCase.executeTest();                                 // Invoking the executeTest method

        System.out.println("Ended Class Object Creation Demo");
    }
}

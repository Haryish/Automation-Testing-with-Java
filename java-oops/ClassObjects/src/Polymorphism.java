
// Polymorphism: Many forms
// Method Overloading: Same method name, different parameters (compile-time polymorphism)
// Method Overriding: Child class provides specific implementation of a method already defined in its parent class (run-time polymorphism)

//Example: Implementing sample progrram to log report and assertions in test cases.. assertions treated as method overloading and report (adapting html and normal report) is treated as method overriding

class Assertion {
    // Method Overloading: Same method name, different parameters
    public void assertEqual(int a, int b) {
        if (a == b) {
            System.out.println("Assertion Passed: " + a + " is equal to " + b);
        } else {
            System.out.println("Assertion Failed: " + a + " is not equal to " + b);
        }
    }

    public void assertEqual(String a, String b) {
        if (a.equals(b)) {
            System.out.println("Assertion Passed: \"" + a + "\" is equal to \"" + b + "\"");
        } else {
            System.out.println("Assertion Failed: \"" + a + "\" is not equal to \"" + b + "\"");
        }
    }

    public void assertEqual(double a, double b) {
        if (a == b) {
            System.out.println("Assertion Passed: " + a + " is equal to " + b);
        } else {
            System.out.println("Assertion Failed: " + a + " is not equal to " + b);
        }
    }
}

class Report {
    public void generateReport(String testName, String status) {
        System.out.println("Generating generic report for " + testName + " with status: " + status);
    }
}

class HtmlReport extends Report {
    @Override
    public void generateReport(String testName, String status) {
        System.out.println("<html><body><h1>HTML Report</h1><p>Test Case: " + testName + "</p><p>Status: " + status + "</p></body></html>");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Polymorphism Demo");
        Report report = new HtmlReport(); // Using HtmlReport which overrides generateReport method
        report.generateReport("Test Case 1", "Passed"); // Calls overridden method in HtmlReport

        Report plainReport = new Report(); // Using PlainTextReport which overrides generateReport method
        plainReport.generateReport("Test Case 2", "Failed"); // Calls overridden method in PlainTextReport

        Assertion assertion = new Assertion();
        assertion.assertEqual(5, 5); // Calls assertEqual with int parameters
        assertion.assertEqual("Hello", "Hello"); // Calls assertEqual with String parameters
        assertion.assertEqual(3.14, 3.14); // Calls assertEqual with double parameters

        System.out.println("Ended Polymorphism Demo");
    }   

}

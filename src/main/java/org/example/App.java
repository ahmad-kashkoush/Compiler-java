package org.example;

public class App {
    public static void main(String[] args) throws ParseException {
        // Your Calculator class's main method already has the testing logic
        System.out.println("Starting the application");
//        Calculator.main(args);
        // Initialize JavaParser with the file content
        JavaParser.main(args);
//        parser.CompilationUnit(); // Start parsing process
        System.out.println("File parsed succesffuly");
        // Now you can type expressions like:
        // 42 + 10 - 5
        // (Press Enter, then Ctrl+D or Ctrl+Z to send EOF)

    }


}

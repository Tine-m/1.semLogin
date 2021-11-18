package demo;

import demo.database.CSVUserHandler;
import demo.database.FileHandlerTextFile;
import demo.domain.Controller;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Controller controller = new Controller(new FileHandlerTextFile());
        controller.start();
    }
}

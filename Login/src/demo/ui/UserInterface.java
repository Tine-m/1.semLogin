package demo.ui;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    public void menu(){
        printMessage("""
                (0) Exit program
                (1) Create user
                (2) Login""");
    }
    public String userInput(){

        return scanner.nextLine();
    }

    public void printMessage(String s) {
        System.out.println(s);
    }
}

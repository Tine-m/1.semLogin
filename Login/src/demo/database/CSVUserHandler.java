package demo.database;

import demo.domain.User;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVUserHandler implements Database {
    private ArrayList<User> users = new ArrayList();
    private final String userfile = "data/Users.csv";

    public CSVUserHandler() {
        ArrayList<String> rawUsers = new ArrayList<>();
        try {
            rawUsers = getLinesFromFile(userfile);
        } catch (FileNotFoundException e){
            System.out.println("No Userfile was found");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String userString : rawUsers) {
            String[] stringParts = userString.split(";");
            users.add(new User(stringParts[0], stringParts[1]));
        }
    }
    @Override
    public User findUser(String name, String password) {
        for (User user : users) {
            if (user.getName().equals(name)
                    && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
    @Override
    // save to users and to CSV file
    public void saveUser(User user) {
        users.add(user);
        try {
            appendToFile(userfile,  user.getName() + ";" + user.getPassword() + ";" + user.getRole());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // will append to the CSV file
    private void appendToFile(String filePath, String userCSV) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(new FileOutputStream(filePath, true));
        printStream.append(userCSV).append("\n");
    }

    // will take a file and return the lines in the file
    private ArrayList<String> getLinesFromFile(String filePath) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        File file = new File(filePath);
        Scanner load = new Scanner(file);
        while (load.hasNextLine()) {
            lines.add(load.nextLine());
        }
        return lines;
    }
}

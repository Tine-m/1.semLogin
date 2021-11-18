package demo.database;

import demo.domain.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class FileHandlerTextFile implements Database {

    private ArrayList<User> users = new ArrayList<>();

    @Override
    //TODO
    public User findUser(String name, String password) {
        return null;
    }

    @Override
    //TODO
    public void saveUser(User user)  {
        File file = new File("data/user.txt");
        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream(file, true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ps.println(user.toString());
        ps.close();
    }
}

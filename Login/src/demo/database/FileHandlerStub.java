package demo.database;
import demo.domain.User;

import java.util.ArrayList;

// File Simulation - uses in memory list instead of csv file
public class FileHandlerStub implements Database {

    private ArrayList<User> users = new ArrayList();

    @Override
    public User findUser(String name, String password) {

        for (int i = 0; i < users.size(); i++) {
            User temp = users.get(i);
            if (temp.getName().equals(name) && temp.getPassword().equals(temp.getPassword())) {
                return temp;
            }
        }
        return null;
    }

    @Override
    public void saveUser(User user) {
        users.add(user);
    }
}

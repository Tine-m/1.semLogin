package demo.database;

import demo.domain.User;

public interface Database {

    public User findUser(String name, String password);

    public void saveUser(User user);

}

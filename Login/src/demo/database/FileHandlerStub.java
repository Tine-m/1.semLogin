package demo.database;

import demo.domain.User;

public class FileHandlerStub implements Database {



    public User findUser(String name, String password){

        //TODO Change later to real code
        return new User("John Smith", "1234");
    }

    public void saveUser(User user){
        System.out.println("Saved");
    }
}

package demo.domain;

//import demo.database.CSVUserHandler;
import demo.database.Database;
import demo.ui.UserInterface;

public class Controller {
    boolean isRunning = true;
    private UserInterface ui = new UserInterface();
    private Database db;

    public Controller(Database db) {
        this.db = db;
    }

    public void start(){

        while(isRunning){
            ui.menu();
            switch (ui.userInput()){
                case "0" -> exit();
                case "1" -> createUser();
                case "2" -> logIn();
                }
        }
    }

    public void createUser() {
        ui.printMessage("Type in user name: ");
        String name = ui.userInput();
        ui.printMessage("Type in password: ");
        String password = ui.userInput();
        User user = new User(name, password);
        db.saveUser(user);

    }

    public void logIn() {
        ui.printMessage("Type in user name: ");
        String name = ui.userInput();
        ui.printMessage("Type in password: ");
        String password = ui.userInput();
        User user = db.findUser(name, password);
        if(user != null){
            ui.printMessage("Welcome user " + name + " " +  user.getRole());
        } else {
            ui.printMessage("User not found");
        }
    }

    public void exit(){
        isRunning = false;
    }
}

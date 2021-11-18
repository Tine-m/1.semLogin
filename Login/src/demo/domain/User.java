package demo.domain;

public class User {
    private String name;
    private String password;
    private String role;

    public User(String name, String password){
        this.name = name;
        this.password = password;
        this.role = "customer";
    }

    public String getRole() {
        return role;
    }
}



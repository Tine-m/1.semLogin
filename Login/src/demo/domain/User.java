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

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}



package GetterAndSetter;

public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        if (username.length()>=5) {
            this.username = username;
        }else {
            System.out.println("Username trebuie sa aiba minim 5 caractere");
        }
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        verificaUsernameul(username);

    }

    private void verificaUsernameul(String username) {
        if (username.length()>=5){
            this.username=username;
        }else {
            System.out.println("Usernameul trebuie sa aiba minim 5 caractere");
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

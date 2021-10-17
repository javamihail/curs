package GetterAndSetter.Exercitii1;

public class UserEx1 {

    private String username;
    private String password;

    public UserEx1(String username, String password) {
        if (username.length() >= 5) {
            this.username = username;
        } else {
            System.out.println("Username trebuie sa aiba minim 5 caractere");
        }
        checkPassword(password);
    }

    private void checkPassword(String password) {
        char[] literaParola = password.toCharArray();
        int numarCifre = 0;
        for (char c : literaParola) {
            if (Character.isDigit(c)) {
                numarCifre++;
            }
        }
        if (numarCifre<2){
            System.out.println("Parola trebuie sa contina minim 2 cifre");
        }else {
            this.password=password;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        checkUser(username);

    }

    private void checkUser(String username) {
        if (username.length() >= 5) {
            this.username = username;
        } else {
            System.out.println("Usernameul trebuie sa aiba minim 5 caractere");
        }
    }

    public void setPassword(String password) {
        checkPassword(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}



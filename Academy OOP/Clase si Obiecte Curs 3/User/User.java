public class User {
    String username;
    String password;

    public User(String username, String password, String confirmPassword) {
        checkUsernameLenght(username);
        checkPasswordLenght(password);

        char [] caractereParola = password.toCharArray();
        int numarCifre=0;
        checkPasswordDigits(caractereParola, numarCifre);

        this.username = username;
        this.password = password;
    }

    private void checkPasswordDigits(char[] caractereParola, int numarCifre) {
        for (char c : caractereParola){
            if (Character.isDigit(c)){
                numarCifre++;


            }
        }
        if (numarCifre<2){
            System.out.println("Problema: Parola trebuie sa contina minim 2 cifre");
        }
    }

    private void checkPasswordLenght(String password) {
        if (password.length()<8){
            System.out.println("Problem: Parola introdusa are mai putin de 8 caractere");
        }
    }

    private void checkUsernameLenght(String username) {
        if (username.length()<7){
            System.out.println("Problema:Usernameul introdus are mai putin de 7 caractere");
        }
    }
}

public class FacebookMain {
    public static void main(String[] args) {


        FacebookUser user1 = new FacebookUser("Tudor", "Andrei", 1995);
        FacebookUser user2 = new FacebookUser("Ana", "Maria", 1992);

        user1.writePost("Afara ploua");
        user1.writePost("Afara numai ploua");


        user2.writePost("Vand Golf 4");
        user2.writePost("S-a vandut ");
        user2.writePost("Check in Caraibe");
        user1.printAllPosts();
        user2.printAllPosts();

    }
}
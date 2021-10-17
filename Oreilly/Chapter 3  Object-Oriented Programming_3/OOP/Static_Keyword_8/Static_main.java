package Static_Keyword_8;

public class Static_main {
    public static void main(String[] args) {
        Static_Keyword sk1 = new Static_Keyword();

        Static_Keyword sk2 = new Static_Keyword();

        Static_Keyword sk3 = new Static_Keyword();
                sk1.age = 7;
                sk1.grade = "2nd";
                sk1.name = "Rob";

                sk2.age = 8;
                sk2.grade = "3rd";
                sk2.name = "Shyam";

                sk3.age = 28;
                sk3.grade = "3nd";
                sk3.name = "Alex";

                sk1.displayDetails();
                sk2.displayDetails();
                sk3.displayDetails();
    }
}

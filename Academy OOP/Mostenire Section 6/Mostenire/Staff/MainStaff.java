public class MainStaff {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader("Tudor", 10000);
        teamLeader.addPeopleInTheTeam(new Programator("Teddy", 7000));
        teamLeader.addPeopleInTheTeam(new Programator("Mircea", 7700));
        teamLeader.addPeopleInTheTeam(new Programator("Ana", 6000));
        teamLeader.addPeopleInTheTeam(new Programator("Maria", 8000));
        teamLeader.addPeopleInTheTeam(new Programator("Ionut", 9000));

        teamLeader.assignWork();

        Cleaner cleaner = new Cleaner("Marian", 5000);
        cleaner.clean();
        Manager manager = new Manager("Gabi", 10000);
        manager.raiseSalary(teamLeader, 2000);
        manager.raiseSalary(cleaner, 1000);

    }
}

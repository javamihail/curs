public class MainShooter {
    public static void main(String[] args) {

        Sniper sniper = new Sniper();
        Pistol pistol = new Pistol();
        AK47 ak47 = new AK47();

        sniper.shoot();
        pistol.shoot();
        ak47.shoot();
    }
}

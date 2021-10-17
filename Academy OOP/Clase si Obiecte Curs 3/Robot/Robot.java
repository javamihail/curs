//Creati o clasa Robot cu urmatoarele campuri: name,atackPower, material si metoda atack(), care se va folosi de campurile obiectiului pentru a printa un mesaj corespunzator
//Adaugati intr-o lista 5 roboti ale caror detalii vor fi introduse de la tastatura.
//Faceti ca toti robotii din lista voastra sa atace.

public class Robot {

    String name;
    int attackPower;
    String material;

    public Robot(String name, int attackPower, String material) {
        this.name = name;
        this.attackPower = attackPower;
        this.material = material;
    }

    public void attack(){
        System.out.println("Robotul" + name + "ataca cu valoarea " + attackPower);


    }
}

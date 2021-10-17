import java.util.ArrayList;

public class Customer {
    String nume;
    int buget;
    ArrayList<Haina> produseCumparate;

    public Customer(String nume, int buget) {
        this.nume = nume;
        this.buget = buget;
        this.produseCumparate = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nume='" + nume + '\'' +
                ", buget=" + buget +
                ", produseCumparate=" + produseCumparate +
                '}';
    }

    public void buyClothes(Haina haina){
        if (this.buget>=haina.pret){
            System.out.println("Clientul " + nume + "a cumparat " + haina);
            this.produseCumparate.add(haina);
            this.buget-=haina.pret;
        }else {
            System.out.println("Nu aveti suficienti bani pentru ca cumpara " + haina);
        }

    }
}

// 2. Customer va cere urmatoare aplicatie:
//"Firma noastra va vinde haine. Toate hainele noastre vor avea in comun o marca si un pret.
// Vom vinde pantaloni, care vor avea un numar specific de buzunare.
// Vom vinde hanorace, care pot sau nu pot avea gluga.
// Vom vinde adidasi, care pot sau nu pot avea sireturi.


//Clientii nostrii vor avea un nume, un buget si o lista de haine cumparate.
// De asemenea, vream ca clientii nostrii sa poata cumpara oricand hainele noastre.
// Creati aplicatia si testati cazurile.

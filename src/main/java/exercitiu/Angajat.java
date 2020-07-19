package exercitiu;

public class Angajat extends Person{
    private int salariu;

    public Angajat(String name, int salariu) {
        super(name);
        this.salariu = salariu;
    }

    public Angajat(int salariu) {
        this.salariu = salariu;
    }

    public Angajat() {
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
}

package zagrevanje;

public class programiranje extends Kurs {
    String podnaziv;
 
    public programiranje(String naziv, int trajanje, int cena, String opis, String podnaziv) {
        super(naziv, trajanje, cena, opis);
        this.podnaziv = podnaziv;
    }

    @Override
    public void stampaj() {
        System.out.println("Naziv kursa: " + naziv + "Podnaziv kursa: "+podnaziv +"\nTrajanje kursa: " + trajanje + "\nCena kursa" + cena + "\nOpis kursa: " + opis);

    }
}

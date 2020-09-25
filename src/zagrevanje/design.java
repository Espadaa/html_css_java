package zagrevanje;

public class design extends Kurs {
    String DesignAlati;
    public design(String naziv, int trajanje, int cena, String opis, String DesignAlati){
        super(naziv, trajanje, cena, opis);
        this.DesignAlati = DesignAlati;
    }
    
    @Override
    public void stampaj(){
        System.out.println("Naziv kursa: "+ naziv+ "\nTrajanje kursa: "+ trajanje+ "\nCena kursa"+cena+"\nOpis kursa: "+opis + "\nDizajn Alati: "+ DesignAlati);
    }
    
}

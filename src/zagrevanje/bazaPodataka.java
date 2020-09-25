package zagrevanje;

public class bazaPodataka extends Kurs {
String bazaRDBMS;
public bazaPodataka(String naziv, int trajanje, int cena, String opis, String bazaRDBMS){
    super(naziv, trajanje, cena, opis);
    this.bazaRDBMS = bazaRDBMS;
}
@Override
public void stampaj(){
        System.out.println("Naziv kursa: "+ naziv+ "\nTrajanje kursa: "+ trajanje+ "\nCena kursa"+cena+"\nOpis kursa: "+opis + "\nRDBMS baza: "+bazaRDBMS );

}
}
package zagrevanje;

public class Vozilo {
String godiste;
int cena;
String marka;

public Vozilo(String godiste, int cena, String marka){
    this.godiste = godiste;
    this.cena = cena;
    this.marka = marka;
}

public void prikazi(){
    System.out.println("Godiste auta je: "+godiste+ "Cena auta je: "+cena+"Marka auta je: "+marka);
}

}

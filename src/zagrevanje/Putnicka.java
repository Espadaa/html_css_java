package zagrevanje;

public class Putnicka extends Vozilo {
    String tip;
public Putnicka(String godiste, int cena, String marka, String tip){
    super(godiste, cena, marka);
    this.tip = tip;
}
@Override
public void prikazi(){
    System.out.println("Godiste auta je: "+godiste+ "Cena auta je: "+cena+"Marka auta je: "+marka+"Tip vozila je: "+tip);
}

}


package zagrevanje;

public class Kamioni extends Vozilo {
    int nosivost;
 public Kamioni(String godiste, int cena, String marka, int nosivost){
     super(godiste, cena, marka);
     this.nosivost = nosivost;
 }
 @Override
 public void prikazi(){
    System.out.println("Godiste auta je: "+godiste+ "Cena auta je: "+cena+"Marka auta je: "+marka+"Nosivost je: "+nosivost);
}

}

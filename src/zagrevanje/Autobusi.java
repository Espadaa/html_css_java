package zagrevanje;

public class Autobusi extends Vozilo {
int brSedista;

public Autobusi(String godiste, int cena, String marka, int brSedista){
    super(godiste, cena, marka);
    this.brSedista = brSedista;
}


@Override
public void prikazi(){
    System.out.println("Godiste auta je: "+godiste+ "Cena auta je: "+cena+"Marka auta je: "+marka+"Broj sedista je: "+brSedista);
}

public String upisi(){
    String a =  ("Godiste auta je: "+godiste+ "Cena auta je: "+cena+"Marka auta je: "+marka+"Broj sedista je: "+brSedista);
    return a;
}
}
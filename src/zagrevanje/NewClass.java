package zagrevanje;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewClass {

    public static int bSedista(int brSedista) {
        if (brSedista < 0 || brSedista > 70) {
            throw new ArithmeticException("Greska, previse ili premalo sedista!");
        } else {
            return brSedista;

        }

    }

    public static void main(String[] args) throws IOException {
    

    Vozilo v = new Vozilo("Dveiljade drugo", 2000, "Pezo");

    Putnicka p = new Putnicka("2000", 3000, "BMW", "karavan");
    Autobusi a = new Autobusi("1999", 16000, "Lasta", bSedista(0));
    Autobusi b = new Autobusi("2000", 16001, "Lasta", bSedista(5));
    Kamioni k = new Kamioni("2010", 20000, "DAF", 5);
    
    a.prikazi();
    
    FileWriter f1 = new FileWriter("autobusi.txt");
    f1.write(a.upisi());
    f1.flush();
    f1.write(b.upisi());
    f1.close();
}

}

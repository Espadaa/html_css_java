package zagrevanje;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Kurs {

    String naziv;
    int trajanje;
    int cena;
    String opis;

    public Kurs(String naziv, int trajanje, int cena, String opis) {
        this.naziv = naziv;
        this.trajanje = trajanje;
        this.opis = opis;
        this.cena = cena;

    }

    public void stampaj() {
        System.out.println("Naziv kursa: " + naziv + "\nTrajanje kursa: " + trajanje + "\nCena kursa" + cena + "\nOpis kursa: " + opis);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        programiranje progr = new programiranje("Java", 8, 120000, "Pocetni kurs jave", "Objektno");
        bazaPodataka BP = new bazaPodataka("Mysql", 8, 10000, "Ucenje pravljenja baze", "RDBMS");
        design design = new design("Adobe", 10, 13000, "Photoshop", "CS5");

        System.out.println("Koji kurs zelite da prikazete: ");
        System.out.println("1/Programiranje, 2/Baza Podataka, 3/Dizajn");
        int unos = sc.nextInt();
        if (unos == 1) {
            progr.stampaj();
            try {
                File myObj = new File("kurs.txt");
                try (FileWriter pisac = new FileWriter("kurs.txt")) {
                    pisac.write(progr.toString());
                    pisac.close();
                }
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } else if (unos == 2) {
            BP.stampaj();
        } else if (unos == 3) {
            design.stampaj();
        } else {
            System.out.println("Uneli ste pogresnu opciju");
        }

    }
}

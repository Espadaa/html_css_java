package Vezba1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Radnici {

    String ime;
    String prezime;
    int godine;

    public Radnici(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    public Radnici() {

    }

    public void prikazi() {
        System.out.println("Ime radnika: " + ime + "\nPrezime radnika: " + prezime + "\nGodine radnika: " + godine);
    }

    public String upisR(Radnici r) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Da li zelite da upisete u tekstualni fajl? da/ne ");
        String unos = sc.nextLine();
        if (unos.equals("da")) {
            try {
                FileWriter f1 = new FileWriter("radnici.txt");
                f1.write();
                f1.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        } else if (unos.equals("ne")) {
            System.out.println("Dovidjenja!");
        } else {
            System.out.println("Uneta komanda nije dobra!");
        }
        
    }

    public  void kreiranjeR() throws IOException {
        Scanner sc = new Scanner(System.in);
        Radnici r = new Radnici();
        System.out.println("Da li zelite da kreirate novog Radnika? da/ne");
        String unos = sc.nextLine();
        if(unos.equals("da")){
            System.out.println("Unesite ime: ");
            r.ime = sc.nextLine();
            System.out.println("Unesite prezime: ");
            r.prezime = sc.nextLine();
            System.out.println("Unesite godine: ");
            r.godine = sc.nextInt();
            Radnici.upisR(r);
        }
        else if(unos.equals("ne")){
            System.out.println("Dovidjenja");
        }
        else{
            System.out.println("Morate da unesete da/ne samo!");
        }
       
    }

    public static void main(String[] args) throws IOException {
        Radnici.kreiranjeR();
    }
}

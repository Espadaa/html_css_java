package zagrevanje;

import java.util.Scanner;
import java.util.regex.*;

public class Validacija {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
    System.out.println("Unesite email adresu");
    String email = sc.nextLine();
    Pattern p = Pattern.compile("^[a-z]{3}@[a-zA-Z_0-9]{3,10}.[a-z]{2,3}$");
    Matcher m = p.matcher(email);
    if(m.find()){
        System.out.println("Email je validan!");
        break;
    }
}
    
    


}
}

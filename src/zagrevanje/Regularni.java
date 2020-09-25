package zagrevanje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class Regularni {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Metchuj ako string sadrzi brojeve od 0 do 9");
        Pattern p = Pattern.compile("[abc]");
        Matcher matcher = p.matcher("I dont have any numbers");
        System.out.println(matcher.find());

        System.out.println("Matcg if string contains characters from d to h");
        p = Pattern.compile("[d-h]");
        matcher = p.matcher("hello world");
        System.out.println(matcher.find());

        System.out.println("Match if string contains characters from a to c and from e to g");
        p = Pattern.compile("[a-ce-g]");
        matcher = p.matcher("I will be matched true");
        System.out.println(matcher.find());

        System.out.println("Match if string contains characters b, i or f");
        p = Pattern.compile("[bif]");
        matcher = p.matcher("bing bang bong bung");
        System.out.println(matcher.find());
        while(true){
        System.out.println("Potrebno je izvrsiti validaciju broja telefona");
        System.out.println("Unesite broj telefona: ");
        String phone = sc.nextLine();
        p = Pattern.compile("^[0-9]{3}/[0-9]{3}-[0-9]{4}$");
        matcher = p.matcher(phone);
        if (matcher.find()) {
            System.out.println("Phone is valid");
            break;
        }

    }
}
}
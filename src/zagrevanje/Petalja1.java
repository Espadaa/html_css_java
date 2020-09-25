package zagrevanje;

import java.util.Scanner;

public class Petalja1 {


public static int faktorijal(int a){
    int suma = 1;
    if(a >=10){
        throw new ArithmeticException("PREVELIK BROJ STE UNELI");
    }
    else
    for(int i = 1; i <= a; i++){
        suma = suma *i;
    }
    return suma;
    }
public static int kvadrat(int broj){
    if(broj <0){
        throw new ArithmeticException("NE RADIM SA NEGATIVNIM BROJEVIMA ");
    }
    else {
        if(broj == 0){
            throw new ArithmeticException("NEDOZVOLJENO RADITI SA 0");
        }
        else{
            return broj*broj;
    }
    }
}

public static void main (String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Molimo unesite broj?");
     
     int y = sc.nextInt();
     
     System.out.println("Faktorijal unetog broja je: "+ faktorijal(y));
     
     System.out.println(kvadrat(5));
}
}
package zagrevanje;

public class Izuzetak {

    public static void main(String[] args){
        int y = 5;
        try{
            int x = 100/0;
            y = 10;
        }
        catch(Exception ex){
            System.out.println("Hey, you cant divide by zero!");
        }
        System.out.println(y);
    }
}

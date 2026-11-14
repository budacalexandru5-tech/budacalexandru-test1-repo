import java.util.Scanner;

public class Ex19 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        String caracter =  input.next();
        switch (caracter){
            case "R" :
                System.out.println("Rosu");
                break;
            case "G":
                System.out.println("Galben");
                break;
            case "V":
                System.out.println("Verde");
                break;
            default:
                System.out.println("Introdu doar R, G sau V!");
        }
    }
}

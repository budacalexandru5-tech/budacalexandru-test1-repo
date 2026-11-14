import java.util.Scanner;

public class Ex9 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int luna = input.nextInt();
        switch (luna){
            case 1:
            case 2:
                System.out.println("Iarna");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Primavara");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Vara");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Toamna");
                break;
            case 12:
                System.out.println("Iarna");
                break;
            default:
                System.out.println("Introdu doar de la 1-12!");
        }
    }
}

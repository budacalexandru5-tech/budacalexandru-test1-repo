import java.util.Scanner;

public class Ex11 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int indiceleMaxim = str.length() - 1;
        int nrCaractere = str.length();
        System.out.println("Indicele maxim : " + indiceleMaxim + " iar nr de caractere : " + nrCaractere);
    }
}

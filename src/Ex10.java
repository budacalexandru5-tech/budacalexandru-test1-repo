import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        String fraza = input.nextLine();
        System.out.println(fraza.toUpperCase(Locale.ROOT));
    }
}

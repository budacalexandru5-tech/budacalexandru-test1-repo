import java.util.Scanner;

public class Ex12 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age == 0 || age > 135) System.out.println("Varsta invalida! (1 - 135)");
        else if (age > 0 && age <= 12) System.out.println("Copil");
        else if (age >= 13 && age <= 18) System.out.println("Adolescent");
        else System.out.println("Adult");
    }
}

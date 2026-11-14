import java.util.Scanner;

public class Ex7 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a % 2 == 0) System.out.println(a + " e par");
        else System.out.println(a + " e impar");
    }
}

import java.util.Scanner;

public class Ex4 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a > b) System.out.println(a + " e mai mare ca " + b);
        else System.out.println(b + " e mai mare ca " + a);
    }
}


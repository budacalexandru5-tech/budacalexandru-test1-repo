import java.util.Scanner;

public class Ex8 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int ora = input.nextInt();
        if((ora >= 0 && ora <= 10) || ora == 24) System.out.println("Este ora " + ora + " si e dimineata");
        else if(ora >= 11 && ora <= 16) System.out.println("Este ora " + ora + " si e amiaza");
        else if(ora >= 17 && ora <= 20) System.out.println("Este ora " + ora + " si e seara");
        else if(ora >= 21 && ora <= 23) System.out.println("Este ora " + ora + " si e noaptea");
        else System.out.println("Introdu ora doar de la 0-24!");
    }
}

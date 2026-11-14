public class Ex16 {
    public static void main() {
        int [] n = new int[10];
        for(int i = 0; i < 10; i++){
            n[i] = i;
        }
        for(int el : n) System.out.print(el + " ");
        System.out.println();
        System.out.println("Valoarea primului el : " + n[0]);
        System.out.println("Valoarea ultimului el : " + n[n.length - 1]);
        System.out.println("Marimea arrayului : " + n.length);
    }
}

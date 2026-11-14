public class Ex15 {
    public static void main() {
        byte [] array = new byte[10];
        for(int el : array) System.out.print(el + " ");
        System.out.println();
        array[4] = 10;
        for(int el : array) System.out.print(el + " ");
    }
}

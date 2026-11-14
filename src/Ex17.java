import java.util.Arrays;

public class Ex17 {
    public static void main() {
        int [] arr = new int[5];
        arr[0] = 30;
        arr[1] = 4;
        arr[2] = 50;
        arr[3] = 56;
        arr[4] = 0;
        for(int el : arr) System.out.print(el + " ");
        System.out.println();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Cel mai mare : " + max);
    }
}

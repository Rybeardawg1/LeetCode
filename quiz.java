import java.util.Scanner;

public class quiz {
    public static void main(String[]args) {
        byte x = (byte)136;
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        int cap = ch;
        cap -= 97;
        System.out.println(cap);
        byte nocap = (byte)(Math.pow(2, cap));
        System.out.println((byte)nocap);
    }
}
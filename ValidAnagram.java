import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("ffuts", "stuff"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] S = s.toCharArray();
        Arrays.sort(S);
        char[] T = t.toCharArray();
        Arrays.sort(T);
        if (Arrays.equals(T, S)) {
            return true;
        }
        return false;
    }
}
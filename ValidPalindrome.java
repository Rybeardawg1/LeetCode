public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(valid("10P0"));
    }

    static boolean valid(String s) {
        String word = s.replaceAll("\\s", "").replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
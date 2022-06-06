public class ValidPalindromeII {
    public static void main(String[] args) {
        ValidPalindromeII start = new ValidPalindromeII();
        System.out.println(start.valid("329923"));
    }

    public boolean valid(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i, i + 1).equals(s.substring(s.length() - i - 1, s.length() - i))) {
                boolean firstCorrection = validII(s.substring(0, i) + s.substring(i + 1, s.length()));
                boolean secondCorrection = validII(s.substring(0, s.length() - i - 1) + s.substring(s.length() - i, s.length()));
                if(!firstCorrection && !secondCorrection) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public boolean validII(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
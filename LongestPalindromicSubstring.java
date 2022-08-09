public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        LongestPalindromicSubstring start = new LongestPalindromicSubstring();
        System.out.println(start.longestPalindrome("racecar"));
    }

    int max;

    public int longestPalindrome(String s) {
        max = 1;
        int len = s.length();
        if (len < 2)
            return len;
        for (int i = 0; i < len - 1; i++) {
            extend(i, i, s);
            extend(i, i + 1, s);
        }
        return max;
    }

    public void extend(int j, int k, String s) {
        while (s.charAt(j) == s.charAt(k) && j > 0 && k < s.length() - 1) {
            j--;
            k++;
        }
        max = Math.max(max, k - j + 1);
    }
}

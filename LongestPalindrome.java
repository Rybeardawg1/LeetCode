public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindrome start = new LongestPalindrome();
        System.out.println(start.longestPalindrome("abccccdd"));
    }

    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int len = s.length();
        int longest = 0;
        for (int i = 0; i < len; i++) {
            char letter = s.charAt(i);
            if (set.contains(letter)) {
                set.remove(letter);
                longest++;
            } else {
                set.add(letter);
            }
        }
        if (!set.isEmpty())
            return longest * 2 + 1;
        return longest * 2;
    }
}
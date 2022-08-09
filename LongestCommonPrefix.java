public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix start = new LongestCommonPrefix();
        String[] strs = new String[] { "flick", "fliwer", "flight" };
        System.out.println(start.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (min > strs[i].length()) {
                min = strs[i].length();
            }
        }
        String ComPre = "";
        for (int i = 0; i < min; i++) {
            for (int z = 0; z < strs.length - 1; z++) {
                if (strs[z].charAt(i) != strs[z + 1].charAt(i)) {
                    return ComPre;
                }
            }
            ComPre = ComPre + strs[0].charAt(i);
        }
        return ComPre;
    }
}
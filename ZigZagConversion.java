import java.util.Arrays;

public class ZigZagConversion {
    public static void main(String[] args) {
        ZigZagConversion start = new ZigZagConversion();
        System.out.println(start.convert("AB", 1));
    }
    // My solution
    // public String convert(String s, int numRows) {
    // if(numRows == 1)
    // return s;
    // char[] letter = s.toCharArray();
    // char[][] zigzag = new char[s.length()][numRows];
    // int row = 0, col = 0, counter = 0;
    // for (char i : letter) {
    // zigzag[row][col] = i;
    // if (counter < numRows - 1) {
    // col++;
    // counter++;
    // } else {
    // col--;
    // row++;
    // if (col == 0)
    // counter = 0;
    // }
    // }
    // String ans = "";
    // for (int i = 0; i < zigzag[0].length; i++)
    // for (int j = 0; j < zigzag.length; j++)
    // ans = ans + zigzag[j][i];

    // return ans;
    // }

    // Optimal Solution
    public String convert(String str, int R) {
        if (R == 1)
            return str;

        char[] s = str.toCharArray();
        char[] t = new char[s.length];

        for (int i = 0, len = 0; i < R; i++) {
            for (int j = 0, k = i; k < s.length; j++) {
                t[len++] = s[k];
                k += ((i == 0 || j % 2 == 0) && i != R - 1 ? 2 * (R - i - 1) : 2 * i);
            }  
        }
        return new String(t);
    }
}
import java.security.CodeSigner;

public class LaunchCode {
    public static void main(String[]args) {
        char[] ans = new char[]{'A', 'B', 'C', 'D', 'E', '1', '2', '3', '4', '5'};
        char[] array = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'Y', 'X', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'}; 
        String Code = "";

        for(char i : ans) {
            for(char z : array) {
                if(i == z) {
                    Code = Code + i;
                    break;
                }
            }
        }
        System.out.println(Code);
    }
}
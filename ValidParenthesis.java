import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(valid("({}[)]"));
    }

    public static boolean valid(String s) {
        String S = s.replaceAll("[^(){}\\[\\] ]", "");
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < S.length(); i++) {
            String str = String.valueOf(S.charAt(i));
            if (str.equals("[")) {
                stack.push("]");
            } else if (str.equals("{")) {
                stack.push("}");
            } else if (str.equals("(")) {
                stack.push(")");
            } else if (str.equals("]") || str.equals("}") || str.equals(")")) {
                if (stack.empty()) {
                    return false;
                } else if (!str.equals(stack.pop())) {
                    return false;
                }
            } else {
                return false;
            }
        }
        if(stack.empty()) {
            return true;
        }
        return false;
    }
}
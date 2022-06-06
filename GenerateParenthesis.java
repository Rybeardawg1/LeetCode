import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GenerateParenthesis {
    
    public static void main(String[] args) {
        GenerateParenthesis start = new GenerateParenthesis();
        System.out.println(start.generateParenthesis(3).toString());
    }

    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<String>();
        return generate(list, n, 0, "");
    }

    public ArrayList<String> generate(ArrayList<String> list, int openP, int closeP, String s) {
        if (openP == 0 && closeP == 0) {
            list.add(s);
        }
        if (openP > 0) {
            generate(list, openP-1, closeP+1, s + "(");
        }
        if (closeP > 0) {
            generate(list, openP, closeP-1, s + ")");
        }
        return list;
    }
}
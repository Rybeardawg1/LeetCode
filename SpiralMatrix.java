import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        SpiralMatrix start = new SpiralMatrix();
        int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(start.spiralOrder(matrix));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new ArrayList<Integer>();
        List<Integer> res = new ArrayList<Integer>();
        int rowBegin = 0, rowEnd = matrix.length - 1, colBegin = 0, colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int j = colBegin; j <= colEnd; j++) 
                res.add(matrix[rowBegin][j]);
            rowBegin++;

            for (int j = rowBegin; j <= rowEnd; j++)
                res.add(matrix[j][colEnd]);
            colEnd--;

            if (rowBegin <= rowEnd) 
                for (int j = colEnd; j >= colBegin; j--) 
                    res.add(matrix[rowEnd][j]);
            rowEnd--;

            if (colBegin <= colEnd) 
                for (int j = rowEnd; j >= rowBegin; j--) 
                    res.add(matrix[j][colBegin]);
            colBegin++;
        }
        return res;
    }

    public boolean done(boolean[][] visited) {
        for (int i = 0; i < visited.length; i++)
            for (int j = 0; j < visited[0].length; j++)
                if (visited[i][j] == false)
                    return false;
        return true;
    }
}
import java.util.Stack;

public class NumberofIslands {

    Stack<Integer> stackX = new Stack();
    Stack<Integer> stackY = new Stack();

    public static void main(String[] args) {
        NumberofIslands start = new NumberofIslands();
        char[][] grid = new char[][] { { '1', '1', '1' },
                { '0', '1', '0' },
                { '1', '1', '1' } };
        System.out.println(start.numIslands(grid));
    }

        public int numIslands(char[][] grid) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == '1') {
                        count++;
                        grid[i][j] = '0';
                        grid = find(grid, i, j);
                    }
                }
            }
            return count;
        }

        public char[][] find(char[][] grid, int x, int y) {
            if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) {
                return grid;
            }
            if (x + 1 < grid.length) {
                if (grid[x + 1][y] == '1') {
                    grid[x + 1][y] = '0';
                    grid = find(grid, x + 1, y);
                }
            }
            if (y + 1 < grid[0].length) {
                if (grid[x][y + 1] == '1') {
                    grid[x][y + 1] = '0';
                    grid = find(grid, x, y + 1);
                }
            }
            if (x - 1 >= 0) {
                if (grid[x - 1][y] == '1') {
                    grid[x - 1][y] = '0';
                    grid = find(grid, x - 1, y);
                }
            }
            if (y - 1 >= 0) {
                if (grid[x][y - 1] == '1') {
                    grid[x][y - 1] = '0';
                    grid = find(grid, x, y - 1);
                }
            }
            return grid;
        }
}
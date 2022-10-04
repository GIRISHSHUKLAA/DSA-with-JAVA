public class Maze4 {
    public static void main(String[] args) {
        boolean[][] boards = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        pathRestriction("", boards, 0, 0);
    }


    static void pathRestriction(String ans, boolean maze[][], int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }
        if (maze[r][c] == false) {
            return;
        }
        if (r < maze.length - 1) {
            pathRestriction(ans + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathRestriction(ans + "R", maze, r, c + 1);
        }

    }
}

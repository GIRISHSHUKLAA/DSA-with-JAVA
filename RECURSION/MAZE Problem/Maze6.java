import java.util.Arrays;

public class Maze6 {
    public static void main(String[] args) {
        boolean[][] boards = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int [][] path =new int[boards.length][boards[0].length];
        allPathPrint("", boards, 0, 0,path,1);
    }


    static void allPathPrint(String ans, boolean maze[][], int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]=step;

            for (int [] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            System.out.println();

            return;
        }
        if (maze[r][c] == false) {
            return;
        }
//        I am considering this block in my path
        maze[r][c] = false;

        path[r][c]=step;

//        condition for going down
        if (r < maze.length - 1) {
            allPathPrint(ans + "D", maze, r + 1, c, path, step+1);
        }
//        condition for going right
        if (c < maze[0].length - 1) {
            allPathPrint(ans + "R", maze, r, c + 1, path, step+1);
        }
//        condition for going up
        if (r > 0) {
            allPathPrint(ans + "U", maze, r - 1, c, path, step+1);
        }
//        condition for going left
        if (c > 0) {
            allPathPrint(ans + "L", maze, r, c - 1, path, step+1);
        }
//       when i am getting out of here at the return position
//       this line is where the condition will be over
//       so before the function get removed also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c]=0;

    }
}

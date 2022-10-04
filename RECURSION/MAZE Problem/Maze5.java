public class Maze5 {
    public static void main(String[] args) {
        boolean[][] boards = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        allPath("", boards, 0, 0);
    }


    static void allPath(String ans, boolean maze[][], int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }
        if (maze[r][c] == false) {
            return;
        }
//        I am considering this block in my path
          maze[r][c]=false;



//        condition for going down
        if (r < maze.length - 1) {
            allPath(ans + "D", maze, r + 1, c);
        }
//        condition for going right
        if (c < maze[0].length - 1) {
            allPath(ans + "R", maze, r, c + 1);
        }
//        condition for going up
        if (r>0) {
            allPath(ans + "U", maze, r-1, c );
        }
//        condition for going left
        if (c>0) {
            allPath(ans + "L", maze, r, c - 1);
        }
//       when i am getting out of here at the return position
//       this line is where the condition will be over
//       so before the function get removed also remove the changes that were made by that function
        maze[r][c]=true;

    }
}

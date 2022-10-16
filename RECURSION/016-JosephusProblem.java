/*
 * There are n people standing in a circle we need to kill kth person in every iteration and this has to be done in
 * a circular manner after repeatedly doing it we need to find a position of the survivor
 * circle position begins with zero
 *
 */
public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(josephus(5,3));

    }
    static int josephus(int n,int k){
        if(n==1){
            return 0;
        }
        return (josephus(n-1,k)+k)%n;
    }

    static  int myjos(int n,int k){
        return josephus(n,k)+1; // if circle starts with 1
    }

}

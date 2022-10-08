/*
 * I/P:- a=4 b=6
 * O/P:- 2
 * There is a relation b/w GCD and a tiling problem
 * Q- If you have a two number a and b, you make a rectangle of size aXb
 * then your GCD problem is finding size of the largest square using which you can tile the whole rectangle
 * so if  a=4,b=6 then o/p is 2
 */

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd1(4, 6));
        System.out.println(gcd2(4, 6));
        System.out.println(gcd3(4, 6));


    }

    static int gcd1(int a, int b) {
//        Time Complexity:-O(min(a,b))
        int ans = Math.min(a, b);
        while (ans > 0) {
            if (a % ans == 0 && b % ans == 0) {
                return ans;
            } else {
                ans--;
            }
        }
        return ans;
    }

    static int gcd2(int a, int b) {
//    Euclidean Algorithms:- This is the basic version of Euclidean algorithm
//    Let b be smaller than a
//    gcd(a,b)=gcd(a-b,b)
//    let g be gcd of a and b
//    a=gx and b=gy,,,, x and y are integer and gcd(x,y)=1 (there should not be any common factor b/w x and y
//    (a-b)=g(x-y)

        while (a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return b; // you can return any number either a or b
    }
    static int gcd3(int a, int b) {
//      Optimized version of  Euclidean Algorithm
//      Time complexity:- O(log(min(a,b))
        if (a == 0)
            return b;
        return gcd3(b % a, a); //if u keep going like this one time 'a' will become zero
//        what is the gcd 0f 0 and 300--->300
    }

}

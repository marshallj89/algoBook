package Recursion;

/**
 * Created by jmarshall on 11/11/15.
 */
public class Rank {

    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,7};
        print("" + rank(7, a));

    }

    public static int rank(int key, int[]a){
        return rank(key, a, 0, a.length-1);
    }

    public static int rank (int key, int[] a, int lo, int hi) {

        if (lo > hi) {
            print("Fail: " + lo + " is greater than " + hi);
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            print("key < a[mid]: key=" + key + ", a[mid]=" + a[mid]);
            return rank(key, a, lo, mid-1);
        } else if (key > a[mid]) {
            print("key > a[mid]: key=" + key + ", a[mid]=" + a[mid]);
            return rank(key, a, mid+1, hi);
        } else {
            print("found!!! mid/return val =" + mid);
            return mid;
        }
    }

    public static void print(String string) {
        System.out.println(string);
    }
}

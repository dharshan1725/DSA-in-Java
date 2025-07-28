import java.util.*;
public class Main{
    public static int natural(int n){
        if(n==0) return 0;
        return n + natural(n-1);
    }
    public static void main(String[] args){
        int N=10;
        int result = natural(N);
        System.out.println(result);
    }
}
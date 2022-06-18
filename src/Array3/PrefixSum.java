package Array3;
//Find if there is a subarray with Sum 0
import java.util.HashSet;
import java.util.Set;

public class PrefixSum {

    static boolean subArrayWithZeroSum(int [] a) {
        int n = a.length;;
        Set<Integer> set = new HashSet<>(); //created set, set me same value do baar save ni hoti h and continues form me value store ni hoti h

        int sum=0;
        for (int i=0;i<n;i++) {
            sum+=a[i];
            if (set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;

    }
    public static void main(String[] args) {
     int a[] = {2,3,1,-4,3,-2};
        System.out.println(subArrayWithZeroSum(a));
        System.out.println("Code By Yash");
    }
}

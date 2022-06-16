package Array2;
//https://leetcode.com/problems/trapping-rain-water
public class maxWater  {

  
static int rainWater(int [] a){
    int ans = 0;
    int leftMx = 0, rightMax = 0;
    int l=0,r =a.length-1;

    while(l<r) {
        if (a[l]<=a[r]) {
            if (a[l] > leftMx) leftMx =a[l];
            else ans +=(leftMx-a[l]);
            l++;
        } else {
            if(a[r] >rightMax) rightMax = a[r];
            else ans += (rightMax-a[r]);
            r--;
        }
    }

    return ans;
}

    public static void main(String[] args) {
    int a[] = {2,4,5,1,4,2,6};
    int ans = rainWater(a);
        System.out.println(ans);

    }
    
}

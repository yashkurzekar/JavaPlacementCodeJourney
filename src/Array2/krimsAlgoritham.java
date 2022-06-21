package Array2;
//Krims Algo
public class krimsAlgoritham {
    static  int largestSumSubArray(int a[]){
        int current = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<a.length;i++){
            current+=a[i];
            if (max < current) max = current;
            if (current<0) current = 0;
        }
        return max;
    }
    //main
    public static void main(String[] args) {
        int a[] = {-2,7,-6,4,1,-3,8};
        System.out.println(largestSumSubArray(a));

    }
}

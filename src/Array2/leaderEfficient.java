package Array2;

public class leaderEfficient {
    //method
    static void leadersinArry(int a[]) {
        int largest = Integer.MIN_VALUE;
        for (int i=a.length-1;i>=0;i--){
            if (a[i]>largest) {
                largest = a[i];
                System.out.print(a[i] + " ");
            }
        }
    }
    //Main Class
    public static void main(String[] args) {
        int a[] = {2,7,6,1,4,3};
        leadersinArry(a);
    }
}

package Array2;
//Leader in array
import java.util.Arrays;
//Big O(n^2) worst case
public class leadderArray {
    public static void main(String[] args){
        int array[] = {2,7,6,1,4,3};
        System.out.println(Arrays.toString(array));
        System.out.println(array.length+" is length of array");
        System.out.println("those are the leader");
        loop1:
        for (int i = 1;i< array.length;i++) {
            for (int j=0;j<array.length;j++){
                if(array[j] < array[i])
                {
                   // System.out.println(array[j]);
                    System.out.print(" "+array[i]);
                    break;
                    //continue loop1;
                }
            }
        }
    }
}

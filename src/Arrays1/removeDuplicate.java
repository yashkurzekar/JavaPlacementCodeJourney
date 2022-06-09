package Arrays1;

import java.util.Arrays;

public class removeDuplicate {
    public static void duplictae(int[] a)
    {
        int j=0;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]!=a[j])
            {
                a[j+1]=a[i];
                //System.out.print(" "+a[i]);
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[] ={1,2,2,3,4,5,5,5,6};
        duplictae(a);
        System.out.println(Arrays.toString(a)); //print whole array
    }
}

package Arrays1;

public class deleteKey {


    public static int deletekey1(int a[],int key) {
        int i = 0;
        int length=a.length;
        for (i=0;i<length;i++){
            if (a[i] == key){
                break;
            }
        }
        if(i==length) return length;
        for (int j=i;j<length-1;j++){
            a[j]=a[j+1];
        }
        return length-1;
    }
    public static void main(String[] args) {
        int a[] = {2,1,4,6,5};
        int key = 1;

        deletekey1(a,key);

        }


}

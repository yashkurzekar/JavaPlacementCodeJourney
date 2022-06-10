package Arrays1;

public class basicArray {
    public static void main(String[] args) {
        int a[] = {2,1,4,6,5};
        int res = -1;
        //6 dhoondna h
        for (int i=0;i<a.length;i++){
            if (a[i]==6)
            {
                res= i;
                break;
            }

        }
        if (res == -1){
            System.out.println("Not found");
        }
        else {
            System.out.println("Milgaya");
        }
    }
}

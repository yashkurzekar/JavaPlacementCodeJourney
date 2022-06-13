package Arrays1;

public class thirdLargestElement {

    public static int secondLargest(int a[]) {
        if(a.length < 2) return -1;

        int largest = 0;
        int secondLargest = -1;

        for(int i = 1; i<a.length; i++) {
            if(a[i] > a[largest]) {
                secondLargest = largest;
                largest = i;
            } else if(a[i] < a[largest]) {
                if(secondLargest == -1 || a[i] > a[secondLargest]) {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
}

    public static void main(String[] args) {
        int array[] = {1,11,3,4,5,6,7,8,9};

        System.out.println(secondLargest(array));
    }
}

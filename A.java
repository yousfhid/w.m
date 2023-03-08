public class A {

    static void reverse(int a[], int n) {


        int[] Array = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            Array[j - 1] = a[i];
            j = j - 1;

        }
        System.out.println("revers array is:");
        for (int y = 0; y < n; y++) {
            System.out.println(Array[y]);
        }

    }

    public static void main(String[] args) {
int [] a={90,20,37,50,60,71};
        System.out.println("-----");
        System.out.println("A");
        System.out.println("------");
        reverse(a,a.length);


        int []b={50,30,29,57,67,66};
        System.out.println("-----");
        System.out.println("B");
        System.out.println("------");
reverse(b, b.length);
    }







}

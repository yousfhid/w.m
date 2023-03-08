import java.util.Arrays;

public class B_clone {
    public static void main(String[] args) {
        int []x={10,20,30,50,60,70};
        int []y=x.clone();
        x[0]=100;
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }
}

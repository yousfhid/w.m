import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        int origina[]={1,2,9,4,5,6,7}, clone[] = new int[7];







         for (int i=0;i<origina.length;i++){
         clone[i]=origina[i];

         }
        System.out.println("the origina Array is :");

   for (int i=0;i<origina.length;i++){
       System.out.println(origina[i]+"");
   }
        System.out.println("the close  Array is :");
   for (int i=0 ;i<clone.length;i++){
       System.out.println(clone[i]+"");
   }
    }

}
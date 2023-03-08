import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;
import java.util.Random;
public class c {
    public ArrayList<String> c= new ArrayList<String>();
    {c.add("yiousf");
        c.add("mohammd");c.add("alli");c.add("yaser");
    }
    public String  removeentry() {
        int size = c.size();
        Random rn = new Random();
        int a  = rn.nextInt(size) ;


        System.out.println(c.get(a));
        c.remove(a);

        a = a-1;
        System.out.println(c.get(a));
        c.remove(a);

        a = a-1;
        System.out.println(c.get(a));
        c.remove(a);

        System.out.println(c.get(a));
        c.remove(a);
        return "done";
    }

    public static void main(String[] args) {
        c a=new c();
        System.out.println(   a.removeentry());
    }
}







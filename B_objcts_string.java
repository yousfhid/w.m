import java.util.Arrays;

public class B_objcts_string {
    public static void main(String[] args) {
        Student s[]=new Student[3];
s[0]=new Student("yousf",13);
s[1]=new Student("Alli",45);
s[2]=new Student("mohammd",38);
Student a[]=new Student[3];
a=s.clone();
s[0]=new Student("mmmmmmmmm",43);
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(a));
    }
}

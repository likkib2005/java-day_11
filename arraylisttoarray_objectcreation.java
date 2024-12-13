import java.util.*;
class arraylist_to_array
{
    public static void main(String args[])
    {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(89);
        a.add(898);
        a.add(1);
        a.add(78);
        object b[]=a.toArray();
        System.out.println(Arrays.toString(b));
    }
}
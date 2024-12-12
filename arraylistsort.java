import java.util.*;
class arraylistsort
{
    public static void main(String args[])
    {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(45);
        a.add(1);
        a.add(18);
        a.add(2);
        Collections.sort(a);
        System.out.println(a);
    }
}
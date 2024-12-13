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
        int b[]=new int[a.size()];
        for(int i=0;i<a.size();i++)
        b[i]=a.get(i);
        System.out.println(Arrays.toString(b));
    }
}
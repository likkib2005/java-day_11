import java.util.*;
class twopairtechniquearraylist
{
    public static void main(String args[])
    {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(45);
        a.add(90);
        a.add(456);
        a.add(78);
        a.add(780);
        int l=0;
        int r=a.size()-1;
        while(l<r)
        {
            int temp=a.get(l);
            a.set(l,a.get(r));
            a.set(r,temp);
            l++;
            r--;
        }
        System.out.println(a);
}       
}
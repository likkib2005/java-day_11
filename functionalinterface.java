import java.util.*;
interface Math{
    public int operation(int a,int b);

    }

class Demo{
    public static void main(String args[])
    {
        Math add=(a,b)->a+b;
        Math sub=(a,b)->a-b;
        System.out.println(add.operation(4,5));
        System.out.println(sub.operation(4,5));
    }
}
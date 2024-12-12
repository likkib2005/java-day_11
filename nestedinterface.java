import java.util.*;
interface out{
    void outer();
    interface in{
        void inner();
    }
    }
class sample implements out.in{
    public void inner()
    {
        System.out.println("Hello i am inner method");
    }
    public static void main(String args[])
    {
        sample f=new sample();
        f.inner();
    }
}
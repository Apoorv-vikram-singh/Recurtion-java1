import java.util.*;
public class rec1 
{
    public static void print1to5(int n, int m)
    {
        if(n==m)
        {
            return;
        }
        System.out.println(n);
        print1to5(n+1, m);
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        print1to5(n, m);
        

    
    
}
}

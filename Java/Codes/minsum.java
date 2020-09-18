import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=9;
        if(sc.hasNext())
        {
            n=sc.nextInt();

        }
        int k=-1;
        if(sc.hasNext())
        {
            k=sc.nextInt();
        }
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=-1;
            if(sc.hasNext())
            {
                a[i]=sc.nextInt();
            }
        }
        a=sum(a,k,n);
        int s=0;
        for(int v=0;v<n;v++)
        {
            s+=a[v];
        }
        System.out.println(s);
    }
    public static int[] sum(int[] d,int m,int g)
    {
        int count=0;
        if(m<=0)
        {
            return d;
        }
        while(m!=count)
        {
            for(int h=0;h<g;h++)
            {
                d[h]=(int)(d[h]/2);
                count++;
                if(count==m)
                {
                    return d;
                }
            }
            if(d[g-1]==0)
            {
                return d;
            }
        }
        return d;
    }
}

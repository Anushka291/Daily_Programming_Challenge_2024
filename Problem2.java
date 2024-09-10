import java.io.*;
import java.util.*;
class Problem2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int AR[]=new int[n];
        int k=0,l=0,j;
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            AR[i]=sc.nextInt();
        }
        for(j=1;j<=1000000;j++)
        {
            if(j>n)
            {
                break;
            }
            if(j!=AR[k])
            {
                System.out.println("Missing Number:"+j);
                l=1;
                break;
            }
            k++;
        }
        if(l==0)
        {
            System.out.println("Missing Number:"+(j));
        }
    }
}
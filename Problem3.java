import java.io.*;
import java.util.*;
class Problem3
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int AR[]=new int[n+1];
        int count=0;
        System.out.println("Enter array elements");
        for(int i=1;i<=n;i++)
        {
            AR[i]=sc.nextInt();
        }
        for(int j=1;j<=100000;j++)
        {
            count=0;
            for(int k=1;k<=n;k++)
            {
                if(AR[k]==j)
                {
                    count++;
                }
            }
            if(count>1)
            {
                System.out.println("Duplicate number:"+j);
                break;
            }
        }
    }
}
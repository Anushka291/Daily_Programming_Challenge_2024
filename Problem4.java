import java.io.*;
import java.util.*;
class Problem4
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the 1st array");
        int m=sc.nextInt();
        System.out.println("Enter the size of the 2nd array");
        int n=sc.nextInt();
        int AR1[]=new int[m];
        int AR2[]=new int[n];
        System.out.println("Enter the elements of the first sorted array:");
        for(int i=0;i<m;i++)
        {
            AR1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the second sorted array:");
        for(int j=0;j<n;j++)
        {
            AR2[j]=sc.nextInt();
        }
        int AR[]=new int[m+n];
        for(int k=0;k<m;k++)
        {
            AR[k]=AR1[k];
        }
        int m1=0;
        for(int l=m;l<(m+n);l++)
        {
            AR[l]=AR2[m1];
            m1++;
        }
        int temp;
        for(int i1=0;i1<(m+n);i1++)
        {
            for(int j1=0;j1<(m+n)-1-i1;j1++)
            {
                if(AR[j1]>AR[j1+1])
                {
                    temp=AR[j1];
                    AR[j1]=AR[j1+1];
                    AR[j1+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int c=0;c<(m+n);c++)
        {
            System.out.print(AR[c]+" ");
        }
    }
}
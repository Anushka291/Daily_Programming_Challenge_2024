import java.io.*;
import java.util.*;
class Problem5
{
    public static void main(String[]args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of the array");
         int n=sc.nextInt();
         int AR[]=new int[n];
         System.out.println("Enter array elements:");
         for(int i=0;i<n;i++)
         {
             AR[i]=sc.nextInt();
         }
         System.out.println("Leaders:");
         int count=0;
         for(int j=0;j<n;j++)
         {
             count=0;
             for(int k=j;k<n;k++)
             {
                 if(AR[j]>=AR[k])
                 {
                     count=1;
                 }
                 else
                 {
                     count=0;
                     break;
                 }
             }
             if(count==1)
             {
                 System.out.print(AR[j]+" ");
             }
         }
    }
}
            
                
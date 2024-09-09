import java.io.*;
import java.util.*;
class Problem1
{
    void merge(int array[],int left,int mid,int right)
    {
        int n1=mid-left+1;
        int n2=right-mid;
        int L[], R[];
        L=new int[n1];
        R=new int[n2];
        for(int i=0;i<n1;i++)
        {
            L[i]=array[left+i];
        }
        for(int j=0;j<n2;j++)
        {
            R[j]=array[mid+1+j];
        }
        int i=0,j=0,k=left;
        while(i<n1&&j<n2)
        {
            if(L[i]<=R[j])
            {
                array[k]=L[i];
                i++;
            }
            else
            {
                array[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            array[k]=L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            array[k]=R[j];
            j++;
            k++;
        }
    }
    void merge_sort(int array[],int left,int right)
    {
        if(left<right)
        {
            int mid=(left+right)/2;
            merge_sort(array,left,mid);
            merge_sort(array,mid+1,right);
            merge(array,left,mid,right);
        }
    }
    void display_Merge(int AR[],int n)
    {
        merge_sort(AR,0,n-1);
        System.out.println("Sorted Array:");
        for(int j=0;j<n;j++)
        {
            if(j!=(n-1))
            {
                System.out.print(AR[j]+",");
            }
            else
            {
                System.out.print(AR[j]);
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Problem1 obj=new Problem1();
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int AR[]=new int[n];
        System.out.println("Enter the elements of the array(either 0,1,2):");
        for(int i=0;i<n;i++)
        {
            AR[i]=sc.nextInt();
        }
        obj.display_Merge(AR,n);
    }
}

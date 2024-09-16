
import java.io.*;
import java.util.*;
class Problem8
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        char ch;
        int k=0,count=0;
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)==' ')
            {
                count++;
            }
        }
        String AR[]=new String[count+1];
        s=s+" ";
        String w;
        int h=0;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                w=s.substring(k,i);
                AR[h++]=w;
                k=i;
                k=k+1;
            }
        }
        for(int c=AR.length-1;c>=0;c--)
        {
            System.out.print(AR[c]+" ");
        }
    }
}
                
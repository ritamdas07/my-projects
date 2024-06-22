import java.util.*;
class Mix_Word
{
    Scanner sc=new Scanner (System.in);
    void main()
    {
        System.out.println("Enter the first word");
        String s1=sc.next().toUpperCase();
        System.out.println("Enter the second word");
        String s2=sc.next().toUpperCase();
        int l=0;
        String s="";
        if (s1.length()>s2.length())
            l=s2.length();
        else
            l=s1.length();
        int j=l-1;
        for (int i=0;i<l;i++)
        {
            char c1=s1.charAt(i);
            char c2=s2.charAt(j);
            s+=c1+""+c2+"";
            j--;
        }
        System.out.println(s);
    }
}
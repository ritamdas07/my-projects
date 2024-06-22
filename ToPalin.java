import java.util.*;
class ToPalin
{
    Scanner sc=new Scanner (System.in);
    boolean checkPalin(String w)
    {
        String nw="";
        for (int i=w.length()-1;i>=0;i--)
            nw+=w.charAt(i)+"";
        if (w.compareTo(nw)==0)
            return true;
        else
            return false;
    }

    String change(String w)
    {
        StringBuffer ob=new StringBuffer(w);
        ob.reverse();
        String rev=ob.toString();
        int f=0;
        String k="";
        if (checkPalin(w)==false)
        {
            char c=rev.charAt(0);
            for (int i=1;i<rev.length();i++)
            {
                if (c!=rev.charAt(i))
                {
                    k=rev.substring(i);
                    break;
                }
            }
            return k;
        }
        else
            return w;
    }

    void main()
    {
        System.out.println("Enter the sentence");
        String s=sc.nextLine().toUpperCase();
        String w[]=s.split(" ");
        String ns="";
        for (int i=0;i<w.length;i++)
        {
            if (checkPalin(w[i])==true)
                ns+=w[i]+" ";
            else
                ns+=w[i]+change(w[i])+" ";
        }
        System.out.println(ns);
    }
}
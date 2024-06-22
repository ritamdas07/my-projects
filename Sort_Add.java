import java.util.*;
class Sort_Add
{
    Scanner sc=new Scanner (System.in);
    void main()
    {
        System.out.println("Enter a word");
        String w=sc.next().toUpperCase();
        char l[]=new char[w.length()];
        for (int i=0;i<w.length();i++)
        {
            char c=w.charAt(i);
            l[i]=c;
        }
        char t;
        for (int i=0;i<l.length;i++)
        {
            for (int j=0;j<l.length-1;j++)
            {
                if (l[j]>l[j+1])
                {
                    t=l[j+1];
                    l[j+1]=l[j];
                    l[j]=t;
                }
            }
        }
        w="";
        for (int i=0;i<l.length;i++)
        {
            w+=l[i];
            System.out.print(l[i]+"");
        }
        System.out.println();    
        String nw="";
        int d=0;
        for (int i=0;i<w.length()-1;i++)
        {
            char c1=w.charAt(i);
            char c2=w.charAt(i+1);
            d=(int)c2-(int)c1;
            nw+=c1+"";
            for (int j=0;j<d-1;j++)
                nw+=(char)((int)++c1)+"";
            if (i==w.length()-2)
                nw+=c2;
        }
        System.out.println(nw);
    }
}
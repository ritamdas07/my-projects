import java.util.*;
class SortAlpha
{
    Scanner sc=new Scanner (System.in);
    String sent;
    int n;
    SortAlpha()
    {
        sent="";
        n=0;
    }

    void acceptsent()
    {
        System.out.println("Enter the sentence");
        sent=sc.nextLine().toUpperCase();
    }

    void sort(SortAlpha P)
    {
        String s=P.sent;
        String w[]=s.split(" ");
        String t="";
        String ss="";
        for (int i=0;i<w.length;i++)
        {
            for (int j=0;j<w.length-1;j++)
            {
                if (w[j].charAt(0)-w[j+1].charAt(0)>0)
                {
                    t=w[j+1];
                    w[j+1]=w[j];
                    w[j]=t;
                }
            }
        }
        for (int i=0;i<w.length;i++)
            ss+=w[i]+" ";
        P.sent=ss;
    }
    
    void display()
    {
        System.out.println("Original sentence: "+sent);
        sort(this);
        System.out.println("Sorted sentence: "+sent);
    }
    void main()
    {
        SortAlpha ob=new SortAlpha();
        ob.acceptsent();
        ob.display();
    }
}
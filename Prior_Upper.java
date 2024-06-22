import java.util.*;
class Prior_Upper
{
    Scanner sc=new Scanner(System.in);
    void main()
    {
        System.out.println("Enter the word");
        String w=sc.next();
        String nw="";
        for (int i=0;i<w.length();i++)
        {
            char c=w.charAt(i);
            if (Character.isUpperCase(c)==true)
                nw+=c+"";
        }
        for (int i=0;i<w.length();i++)
        {
            char c=w.charAt(i);
            if (Character.isUpperCase(c)==false)
                nw+=c+"";
        }
        System.out.println(nw);
    }
}
import java.util.*;
class Snowball
{
    Scanner sc=new Scanner (System.in);
    void main()
    {
        System.out.println("Enter the sentence");
        String s=sc.nextLine().toUpperCase();
        char lc=s.charAt(s.length()-1);
        if (lc!='.' && lc!='!' && lc!='?')
        {
            System.out.println("INVALID INPUT!!");
            System.exit(0);
        }
        s=s.substring(0,s.length()-1);
        String w[]=s.split(" ");
        int f=0;
        for (int i=0;i<w.length-1;i++)
        {
            if (w[i+1].length()-w[i].length()!=1)
                f+=1;
        }
        if (f==0)
            System.out.println("Snowball String");
        else
            System.out.println("Not a Snowball String");
    }
}
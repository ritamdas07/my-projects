import java.util.*;
class Consecutive_Letter
{
    Scanner sc=new Scanner (System.in);
    void main()
    {
        System.out.println("Enter the word");
        String w=sc.next().toUpperCase();
        int freq=0;
        for (int i=0;i<w.length()-1;i++)
        {
            char c1=w.charAt(i);
            char c2=w.charAt(i+1);
            if (c2==c1+1)
            {
                freq++;
                System.out.println(c1+""+c2);
            }
        }
        System.out.println("Frequency: "+freq);
    }
}
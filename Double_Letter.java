import java.util.*;
class Double_Letter
{
    Scanner sc=new Scanner (System.in);
    void main()
    {
        System.out.println("Enter the sentence");
        String s=sc.nextLine().toUpperCase();
        for (int i=0;i<s.length()-1;i++)
        {
            char c1=s.charAt(i);
            char c2=s.charAt(i+1);
            if (c1==c2)
                System.out.println(c1+""+c2);
        }
    }
}
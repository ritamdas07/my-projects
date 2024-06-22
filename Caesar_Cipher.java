import java.util.*;
class Caesar_Cipher
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the text");
        String s=sc.nextLine();
        int l=s.length();
        if (l<=3 || l>=100)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        String s1="";
        for (int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            if (Character.isLetterOrDigit(c)==false)
                s1+=c;
            else
            {   
                int val=(int) c;
                char c1;
                if (val>77 && val>109)
                {
                    c1=(char)(val-13);
                    s1+=c1;
                }
                else
                {
                    c1=(char)(val+13);
                    s1+=c1;
                }
            }
        }
        System.out.println(s1);
    }
}
import java.util.*;
class String_Palindrome
{
    Scanner sc=new Scanner (System.in);
    void main()
    {
        System.out.println("Enter the word");
        String w=sc.nextLine().toUpperCase();
        String rw="";
        for (int i=w.length()-1;i>=0;i--)
            rw+=w.charAt(i);
        if (w.compareTo(rw)==0)
            System.out.println("The string is palindrome.");
        else
            System.out.println("The string is not palindrome");
    }
}
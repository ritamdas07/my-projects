import java.util.*;
class Anagram
{
    Scanner sc=new Scanner (System.in);
    void main()
    {
        System.out.println("Enter the word");
        String w=sc.next().toUpperCase();
        String l[]=w.split("");
        for (int i=l.length-1;i>=0;i--)
            System.out.print(l[i]);
    }
}
import java.util.*;
class Reverse_Words
{
    Scanner sc=new Scanner (System.in);
    void main()
    {
        System.out.println("Enter the sentence");
        String s=sc.nextLine().toUpperCase();
        String w[]=s.split(" ");
        for (int i=w.length-1;i>=0;i--)
            System.out.print(w[i]+" ");
    }
}
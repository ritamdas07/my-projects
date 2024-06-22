import java.util.*;
class Prominent_Vowel
{
    Scanner sc=new Scanner (System.in);
    void main()
    {
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        int ca=0,ce=0,ci=0,co=0,cu=0;
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (c=='A'||c=='a')
            {
                ca++;
                System.out.print(c+", ");
            }
            if (c=='E'||c=='e')
            {
                ce++;
                System.out.print(c+", ");
            }
            if (c=='I'||c=='i')
            {
                ci++;
                System.out.print(c+", ");
            }
            if (c=='O'||c=='o')
            {
                co++;
                System.out.print(c+", ");
            }
            if (c=='U'||c=='u')
            {
                cu++;
                System.out.print(c+", ");
            }
        }
        System.out.println();
        System.out.println("The prominent vowel is:");
        if (ca>ce && ca>ci && ca>co && ca>cu)
            System.out.println("a");
        if (ce>ca && ce>ci && ce>co && ce>cu)
            System.out.println("e");
        if (ci>ca && ci>ce && ci>co && ci>cu)
            System.out.println("i");
        if (co>ca && co>ce && co>ci && co>cu)
            System.out.println("o");
        if (cu>ca && cu>ce && cu>ci && cu>co)
            System.out.println("u");
    }
}
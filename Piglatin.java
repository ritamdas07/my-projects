import java.util.*;
class Piglatin
{
    Scanner sc=new Scanner (System.in);
    String txt;
    int len;
    Piglatin()
    {
        txt="";
        len=0;
    }

    void readstring()
    {
        System.out.println("Enter the word");
        txt=sc.nextLine().toUpperCase();
    }

    void convert()
    {
        len=txt.length();
        String s1="";
        String s2="";
        for (int i=0;i<len;i++)
        {
            char c=txt.charAt(i);
            if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                s1=txt.substring(0,i);
                s2=txt.substring(i);
                break;
            }
        }
        txt=s2+s1+"AY";
        System.out.println("Piglatin word is "+txt);
    }

    void consonant()
    {
        int count=0;
        for (int i=0;i<len;i++)
        {
            char c=txt.charAt(i);
            if (c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U')
                count++;    
        }
        System.out.println("The no. of consonants is: "+count);
    }
    
    void main()
    {
        Piglatin ob=new Piglatin();
        ob.readstring();
        ob.convert();
        ob.consonant();
    }
}
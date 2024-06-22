import java.util.*;
class Register
{
    Scanner sc=new Scanner (System.in);
    String stud[];
    int cap, top;
    Register(int max)
    {
        cap=max;
        top=0;
        stud=new String[cap];
    }

    void push(String n)
    {
        for (int i=0;i<=cap;i++)
        {
            System.out.println("Enter the names");
            String name=sc.nextLine();
            if (i==cap)
            {
                System.out.println("OVERFLOW");
                break;            
            }
            int t=cap;
            while (t-2!=-1)
            {
                stud[t-1]=stud[t-2];
                t--;
            }
            stud[top]=name;
            t=cap;
        }
    }

    String pop()
    {
        String s="";
        s=stud[top];
        int t=0;
        while (t<cap-1)
        {
            stud[t+1]=stud[t];
            t++;
        }
        return s;
    }
}
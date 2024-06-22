import java.util.*;
class Dec_Roman
{
    Scanner sc=new Scanner(System.in);
    void main()
    {
        int dec[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String rom[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        System.out.println("Enter a number between 1 and 3999");
        int num=sc.nextInt();
        String val="";
        if (num<1 || num>3999)
        {
            System.out.println("Range must be within 3999");
            System.exit(0);
        }
        for (int i=0;i<dec.length;i++)
        {
            while (num>=dec[i])
            {
                num-=dec[i];
                val+=rom[i];
            }
        }
        System.out.println("Corresponding Roman value = "+val);
    }
}
import java.util.*;
class Prime
{
    Scanner sc=new Scanner (System.in);
    int arr[][];
    int m,n;
    Prime()
    {
        m=0;
        n=0;
        arr=new int[m][n];
    }

    int isPrime(int p)
    {
        int f=0;
        for (int i=1;i<=p;i++)
        {
            if (p%i==0)
                f++;
        }
        if (f==2)
            return 1;
        else
            return 0;
    }

    void fill()
    {
        System.out.println("Enter the no. of rows.");
        int m=sc.nextInt();
        System.out.println("Enter the no. of columns");
        int n=sc.nextInt();
        arr=new int[m][n];
        int total=m*n;
        int count=0;
        if (m>20 || n>20)
        {
            System.out.println("Size cannot exceed 20");
            System.exit(0);
        }
        for (int i=2;count<total;i++)
        {
            if (isPrime(i)==1)
            {
                for (int a=0;a<m;a++)
                {
                    for (int b=0;b<n;b++)
                        arr[a][b]=i;
                    count++;
                }
            }
        }
    }

    void display()
    {
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }

    void main()
    {
        Prime ob=new Prime();
        ob.fill();
        ob.display();
    }
}
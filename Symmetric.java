import java.util.*;
class Symmetric
{
    Scanner sc=new Scanner (System.in);
    void main()
    {
        System.out.println("Enter the no. of rows");
        int m=sc.nextInt();
        System.out.println("Enter the no. of columns");
        int n=sc.nextInt();
        if (m!=n)
        {
            System.out.println("INVALID INPUT!!!");
            System.exit(0);
        }
        int A[][]=new int[m][n];
        int B[][]=new int[m][n];
        System.out.println("Enter the elements of the matrix");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
                A[i][j]=sc.nextInt();
        }
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (i==j)
                    B[i][j]=A[i][j];
                else 
                    B[i][j]=A[j][i];
            }
        }
        int f=0;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (B[i][j]!=A[i][j])
                {
                    f=1;
                    break;
                }
            }
        }
        if (f==1)
            System.out.println("Not a symmetric matrix");
        else
            System.out.println("Symmetric matrix");
    }
}
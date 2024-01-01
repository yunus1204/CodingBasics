import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int n=(2*row)-1;
        int mat[][]=new int[n][n];
        int j=0;
        for(int i=0;i<row;i++)
        {
            j=n-i-1;
            mat[i][i]=i+1;
            mat[j][j]=i+1;
            mat[i][j]=i+1;
            mat[j][i]=i+1;
        }
        for(int p=0;p<n;p++)
        {
            for(int q=0;q<n;q++)
            {
                System.out.print(mat[p][q]+"  ");
            }
            System.out.println();
        }
    }
}
// 1           1
//   2       2
//     3   3
//       5 
//     3   3
//   2       2
// 1           1  

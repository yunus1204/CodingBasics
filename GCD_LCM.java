import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=gcd(a,b);
        System.out.println("GCD : "+gcd);
        int lcm=(a*b)/gcd;
        System.out.println("LCM :"+lcm);
        
    }
    static int gcd(int x,int y)
    {
        if(x!=0 && y==0) return x;
        else if(y!=0 && x==0) return y;
        else if(x==y) return x;
        else{
            // int min=0;
            // if(x<y) min=x;
            // else min=y;
            // for(int i=min;)
            
            
            // method 1
            while(x!=y)
            {
                if(x>y)
                    x=x-y;
                else
                    y=y-x;
            }
            return x;
            
            //method 2 
            // by modulas
            if(x>y)
                return gcd(x%y,y);
            else
                return gcd(x,y%x);
        }
    }
}

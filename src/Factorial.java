import java.util.*;
class Factorial
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number");
        int n=scn.nextInt();
        int x=1;
        for (int i=1;i<=n ;i++ )
        {
            x=x*i;
        }
        System.out.println(x);
    }
}

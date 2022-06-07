import java.util.Scanner;
class handshake
{
    public static void main(String[]args)
    {
        int n,sum=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
    {
        sum=sum+i;
        
    }
    System.out.println(sum);
    }
}
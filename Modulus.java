import java.util.Scanner;
class Modulus
{
    public static void main(String[]args)
    {
        int a,b;
        int c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a%b;
        System.out.println(c);
        sc.close();
        
    }
}
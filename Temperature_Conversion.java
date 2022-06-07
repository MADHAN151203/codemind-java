import java.util.Scanner;
class area
{
    public static void main(String[]args)
    {
        double c,f;
        Scanner sc =new Scanner(System.in);
        c=sc.nextDouble();
        f=32+(1.8*c);
        System.out.printf("%.2f",f);
        sc.close();
    }
}
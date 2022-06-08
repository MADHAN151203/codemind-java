import java.util.Scanner;
class ASC11
{
    public static void main(String[]args)
    {
        char a;
        Scanner sc=new Scanner(System.in);
        a=sc.next().charAt(0);
        int asciivalue = a;
        System.out.println(+asciivalue);
        sc.close();
    }
}
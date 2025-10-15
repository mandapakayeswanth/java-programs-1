import java.util.Scanner;
public class ExceptionHandling1
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the values of a,b:");
            a = sc.nextInt();
            b = sc.nextInt();
            c = a / b;
            System.out.println("c=" + c);
            int arr[]={50,60,70};
            arr[100]=80;
            System.out.println(arr[80]);
        }
        catch(ArrarIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception:\n" + e);
        }
        finally
        {
            System.out.println("Finally is executed");
        }
    }
}
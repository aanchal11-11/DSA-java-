import java.util.*;
public class pattern4 {
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sp=n-1,star=1;
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=sp;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            sp--;
            star++;
        }
    }
    
}

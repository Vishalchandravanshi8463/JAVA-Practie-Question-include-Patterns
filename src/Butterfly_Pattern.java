
public class Butterfly_Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n;i++)
        {
            for(int j=1,p=1;j<=i;j++,p++)
            {
                System.out.print(" "+p);
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
          //  System.out.print("1");
            for(int j=i;j<n;j++)
            {
                System.out.print("  ");
            }
           //  System.out.print("1");
            for(int j=1,p=1;j<=i;j++,p++)
            {
                System.out.print(" "+p);
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=i,p=1;j<=n;j++,p++)
            {
                System.out.print(" "+p);
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }//System.out.print("1");
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i,p=1;j<=n;j++,p++)
            {
                System.out.print(" "+p);
            }
            System.out.println("");
        }
    }
}

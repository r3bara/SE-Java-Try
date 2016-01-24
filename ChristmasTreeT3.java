import java.io.PrintStream;

class ChristmasTreeT3
{

    ChristmasTreeT3()
    {
    }

    public static void main(String args[])
    {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        
        if (i > 2)
        {
            if (j > 0)
            {
                for (int k = 0; k < i - 1; k++)
                {
                    for (int i1 = 1; i1 <= j; i1++)
                    {
                        if (i1 > 1)
                            System.out.print(" ");
                        
                        int k1 = i - 2 - k;
                        
                        for (int i2 = 0; i2 < k1; i2++)
                            System.out.print(" ");

                        for (int j2 = 0; j2 < k * 2 + 1; j2++)
                            System.out.print("*");

                        for (int k2 = 0; k2 < k1; k2++)
                            System.out.print(" ");

                    }

                    System.out.println();
                }

                int l = (i / 10) * 2 + 1;
                int j1 = (i - 2) * 2 + 1;
                int l1 = (j1 - l) / 2;
                
                for (int l2 = 1; l2 <= j; l2++)
                {
                    if (l2 > 1)
                        System.out.print(" ");
                    for (int i3 = 0; i3 < l1; i3++)
                        System.out.print(" ");

                    for (int j3 = 0; j3 < l; j3++)
                        System.out.print("I");

                    for (int k3 = 0; k3 < l1; k3++)
                        System.out.print(" ");

                }

                System.out.println();
            }
        } else
        {
            System.out.println("Ein Baum muss mindestens die H\366he 3 haben.");
        }
    }
}

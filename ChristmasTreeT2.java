import java.io.PrintStream;

class ChristmasTreeT2
{

    ChristmasTreeT2()
    {
    }

    public static void main(String args[])
    {
<<<<<<< Updated upstream
        int i = Integer.parseInt(args[0]);
        char c = args[1].charAt(0);
        if(i > 2)
        {
            int j = i * 2 + 1;
            for(int k = 0; k < j; k++)
=======
        final int i = Integer.parseInt(args[0]);
        final char c = args[1].charAt(0);
        
        if (i > 2)
        {
            final int j = i * 2 + 1;
            for (int a = 0; a < j; a++)
>>>>>>> Stashed changes
                System.out.print(c);

            System.out.println();
            
<<<<<<< Updated upstream
            for (int l = 0; l < i - 1; l++)
            {
                System.out.print((new StringBuilder()).append(c).append(" ").toString());
                int j1 = i - 2 - l;
                for (int l1 = 0; l1 < j1; l1++)
                    System.out.print(" ");

                for (int i2 = 0; i2 < l * 2 + 1; i2++)
=======
            for (int b = 0; b < i - 1; b++)
            {
                System.out.print((new StringBuilder()).append(c).append(" ").toString());
                
                final int j1 = i - 2 - b;
                
                for (int b1 = 0; b1 < j1; b1++)
                    System.out.print(" ");

                for (int i2 = 0; i2 < b * 2 + 1; i2++)
>>>>>>> Stashed changes
                    System.out.print("*");

                for (int j2 = 0; j2 < j1; j2++)
                    System.out.print(" ");

                System.out.print((new StringBuilder()).append(" ").append(c).toString());
                System.out.println();
            }

<<<<<<< Updated upstream
            int i1 = (i / 10) * 2 + 1;
            int k1 = (i - 2) * 2 + 1;
            int k2 = (k1 - i1) / 2;
            System.out.print((new StringBuilder()).append(c).append(" ").toString());
            
            for (int l2 = 0; l2 < k2; l2++)
=======
            final int i1 = (i / 10) * 2 + 1;
            final int a1 = (i - 2) * 2 + 1;
            final int a2 = (a1 - i1) / 2;
            
            System.out.print((new StringBuilder()).append(c).append(" ").toString());
            
            for (int b2 = 0; b2 < a2; b2++)
>>>>>>> Stashed changes
                System.out.print(" ");

            for (int i3 = 0; i3 < i1; i3++)
                System.out.print("I");

<<<<<<< Updated upstream
            for (int j3 = 0; j3 < k2; j3++)
=======
            for (int j3 = 0; j3 < a2; j3++)
>>>>>>> Stashed changes
                System.out.print(" ");

            System.out.print((new StringBuilder()).append(" ").append(c).toString());
            System.out.println();
            
<<<<<<< Updated upstream
            for (int k3 = 0; k3 < j; k3++)
=======
            for( int a3 = 0; a3 < j; a3++)
>>>>>>> Stashed changes
                System.out.print(c);

            System.out.println();
        } else
        {
            System.out.println("Ein Baum muss mindestens die H\366he 3 haben.");
        }
    }
}

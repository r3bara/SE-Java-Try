import java.io.PrintStream;

class ChristmasTree
{

ChristmasTree()
{
}

public static void main(String args[])
{
int i = Integer.parseInt(args[0]);
char c = args[1].charAt(0);
if(i > 2)
{
int j = i * 2 + 1;
for(int k = 0; k < j; k++)
System.out.print(c);

System.out.println();
for(int l = 0; l < i - 1; l++)
{
System.out.print((new StringBuilder()).append(c).append(" ").toString());
int j1 = i - 2 - l;
for(int l1 = 0; l1 < j1; l1++)
System.out.print(" ");

for(int i2 = 0; i2 < l * 2 + 1; i2++)
System.out.print("*");

for(int j2 = 0; j2 < j1; j2++)
System.out.print(" ");

System.out.print((new StringBuilder()).append(" ").append(c).toString());
System.out.println();
}

int i1 = (i / 10) * 2 + 1;
int k1 = (i - 2) * 2 + 1;
int k2 = (k1 - i1) / 2;
System.out.print((new StringBuilder()).append(c).append(" ").toString());
for(int l2 = 0; l2 < k2; l2++)
System.out.print(" ");

for(int i3 = 0; i3 < i1; i3++)
System.out.print("I");

for(int j3 = 0; j3 < k2; j3++)
System.out.print(" ");

System.out.print((new StringBuilder()).append(" ").append(c).toString());
System.out.println();
for(int k3 = 0; k3 < j; k3++)
System.out.print(c);

System.out.println();
} else
{
System.out.println("Ein Baum muss mindestens die H\366he 3 haben.");
}
}
}
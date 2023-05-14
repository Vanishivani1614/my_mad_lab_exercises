/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Main
{
public static void main(String[] args) 
{
 int i, j, k;
for(i=4;i>=1;i--)
{
for(j=4;j>i;j--)
{
System.out.print(" ");
}
for(k=1;k<(i*2);k++)
{
System.out.print("*");
}
System.out.println();
}
}
}
import java.util.*;
import java.util.Scanner;
public class perfect_square
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int M=sc.nextInt();
int product=N*M;
double ps=Math.sqrt(product);
int count=0;
if((ps-Math.floor(ps))==0)
{
count++;
}
if(count==0)
{
System.out.println("no");
}
else
{
System.out.println("yes");
}
}
}

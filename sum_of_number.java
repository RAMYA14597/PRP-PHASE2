import java.util.*;
import java.util.Scanner;
public class sum_of_number
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rem,sum=0,i;
if(n<=100000)
{
for(i=0;i<=n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
}

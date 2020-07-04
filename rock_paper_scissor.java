import java.util.Scanner;
import java.util.*;
public class rock_paper_scissor
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char P,R,S;
char c1=sc.next().charAt(0);
char c2=sc.next().charAt(0);
if(c1=='P' && c2=='R')
{
System.out.println("P");
}
else if(c1=='P' && c2=='S')
{
System.out.println("S");
}
else if(c1=='R' && c2=='S')
{
System.out.println("R");
}
else{
System.out.println("0");
}
}}

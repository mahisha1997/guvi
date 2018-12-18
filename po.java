import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
public static void main(String[]args)
{
int num;
Scanner scan = new Scanner(System.in);
num = scan.nextInt();
if(num>0)
{
System.out.println("Positive");
}
else if(num==0)
{
System.out.println("Zero");
}
else
{
System.out.println("Negative");
}
}
}

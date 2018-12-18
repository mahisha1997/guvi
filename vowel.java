import java.util.*;
import java.lang.*;
import java.io.*;
class vowel
{
public static void main(string[]args)
{
char ch;
Scanner scan =new Scanner(System.in);
ch =scan.next().charAt(0);
if(c=='a' || c=='e' || c=='i' || c=='o' || c='u')
{
System.out.println("vowel");
}
else if(ch=='f')
{
System.out.println("consonant");
}
else
{
System.out.println("invalid");
}
}
}

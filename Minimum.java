import java.util.*;
class Minimum
{
public static void main(String args[])
{
int n,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter elements-");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int min=a[0];
for(i=1;i<n;i++)
{
if(a[i]<min)
min=a[i];
}
System.out.println("the minimum element is:"+min);
}
}

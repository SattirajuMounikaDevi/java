import java.util.*;
class PrimeNumber
{
public static void main(String args[])
{
int n,x,k=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
x=sc.nextInt();
for(int i=x;i<=n;i++)
{
k=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
k=k+1;
}
if(k==2)
System.out.println(i);
}
}
}




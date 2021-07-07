import java.util.*;
class PrimeNumber2
{
public static void main(String args[])
{
int i,j,n,k=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
n=sc.nextInt();
System.out.println("enter array elements:");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for( i=1;i<=n;i++)
k=0;
for( j=1;j<=i;j++)
if(i%j==0)
k+=1;
if(k==2)
System.out.println("no.of prime numbers are:"+i);
}
}

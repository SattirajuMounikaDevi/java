import java.util.*;
class Even_Odd
{
public static void main(String args[])
{
int n,i,j,evencount=0,oddcount=0;
int mul=1;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Enter array elements");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
if(a[i]%2==0)
evencount++;
if(evencount%2==0)
System.out.println("EVEN");
else
System.out.println("ODD");
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for(j=0;j<n;j++)
if(a[j]%2!=0)
oddcount++;
if(oddcount%2!=0)
System.out.println("ODD");
else
System.out.println("EVEN");
for(i=0;i<n;i++)
for(j=0;j<n;j++)
 mul=evencount*oddcount;
System.out.println(mul);
if(mul%2==0)
System.out.println("Even");
else
System.out.println("Odd");
}
}




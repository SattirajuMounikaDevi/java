import java.util.*;
class RightRotation 
{
public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
int i;
int n=sc.nextInt();
int k=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(i=0;i<n;i++)                  
a[i]=sc.nextInt();
for(i=0;i<n;i++)
{
if(k-i<0)
{
b[n+k-i]=a[i];
}
else
b[k-i]=a[i];
}
for(i=0;i<n;i++)
System.out.print(b[i]+" ");
}
}


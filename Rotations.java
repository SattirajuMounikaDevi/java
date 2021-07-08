import java.util.*;
class Rotation
 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i;
int n=sc.nextInt();
int x=sc.nextInt();
int y=sc.nextInt();
int m[]=new int[n];
int k[]=new int[n];
int s[]=new int[n];
for(i=0;i<n;i++)
m[i]=sc.nextInt();
for(i=0;i<n;i++)
{
if((i-x)<0)
{
k[i]=m[n+i-x];
}
else
k[i]=m[i-x];
}
for(i=0;i<n;i++)
{
if((i-y)<0)
{
s[n+i-y]=k[i];
}
else
s[i-y]=k[i];
}
for(i=0;i<n;i++)
System.out.print(s[i]+" ");
}
}

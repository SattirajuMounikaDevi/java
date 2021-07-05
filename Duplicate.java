class Duplicate
{
public static void main (String args [])
{
int i,j;
int a[]={2,3,4,2,3,5,6,8,9,5};
for(i=0;i<10;i++)
{
for(j=i+1;j<10;j++)
{
if(a[i]==a[j])
System.out.println("The DUPLICATE element in the array is :"+a[j]);
}
}
}
}

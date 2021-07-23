import java.util.Scanner;
class linear_search1
{
public static void main(String om[])
{
System.out.println("Enter size of array: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter elements: ");
for(int i=0;i<n;i++)
{
  a[i]=sc.nextInt();
}
System.out.println("Enter an element to search: ");
int e=sc.nextInt();
boolean flag=false;
int count=0;
for(int i=0;i<n;i++)
{
  if(a[i]==e)
  {
    flag=true;
    break;
  }
  else
  { flag=false;
    count++;
  }
}
if(flag)
System.out.println("ELEMENT FOUND");
else
System.out.println("ELEMENT NOT FOUND");
System.out.println("Number of comparisons: "+count);

}
}

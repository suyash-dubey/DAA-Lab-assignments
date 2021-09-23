import java.util.Scanner;
//SUYASH DUBEY    SECTION C    2014907
class linear_search1
{
public static void main(String om[])
{
System.out.println("Enter size of array: ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
  //SUYASH DUBEY    SECTION C    2014907
int a[]=new int[n];
System.out.println("Enter elements: ");
for(int i=0;i<n;i++)
{
  a[i]=sc.nextInt();
}
System.out.println("Enter an element to search: ");
int e=sc.nextInt();
boolean flag=false;
  //SUYASH DUBEY    SECTION C    2014907
int count=0;
for(int i=0;i<n;i++)
{
  if(a[i]==e)
  {
    flag=true;
    break;
  }
  //SUYASH DUBEY    SECTION C    2014907
  else
  { flag=false;
    count++;
  }
}
  //SUYASH DUBEY    SECTION C    2014907
if(flag)
System.out.println("ELEMENT FOUND");
else
System.out.println("ELEMENT NOT FOUND");
System.out.println("Number of comparisons: "+count);
  //SUYASH DUBEY    SECTION C    2014907

}
}

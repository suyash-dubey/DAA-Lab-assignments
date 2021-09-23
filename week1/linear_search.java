import java.util.*;
//SUYASH DUBEY    SECTION C    2014907
class linear_search
{
  public static void main(String om[])
  {
    int n,size,key;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int k=0;k<n;k++)
    {
      size=sc.nextInt();
      int []a=new int[size];
      for(int j=0;j<size;j++)
      {
        a[j]=sc.nextInt();
      }
      //SUYASH DUBEY    SECTION C    2014907
      key=sc.nextInt();
      int count=0;
      boolean flag=false;
      for(int i=0;i<size;i++)
      {
        if(a[i]==key)
        {
          count++;
          flag=true;
          break;
        }
        else count++;
      }
      if(flag==true)
      {
        System.out.println("Present"+count);
      }
      else{
        System.out.println("Not Present"+count);
      }
    }
//SUYASH DUBEY    SECTION C    2014907
  }
}
//SUYASH DUBEY    SECTION C    2014907

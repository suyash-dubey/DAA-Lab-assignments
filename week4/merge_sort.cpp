#include<iostream>
#include<bits/stdc++.h>
#include<algorithm>
using namespace std;
int merge(int *a,int low, int mid, int high)
{
    int temp[20];
    int c=0;
    int i=low, j=mid+1, index =low;
    while(i<=mid && j<=high)
    {
        if(a[i]<a[j])
        {   temp[index]=a[i];
            i++;
            c++;
        }
        else
        {   temp[index]=a[j];
            j++;
            c++;
        }
        index++;
    }
    if(i<=mid)
    {
        while(i<=mid)
        {   temp[index]=a[i];
            i++;
            index++;
        }
    }
    else
    {   while(j<=high)
        {   temp[index]=a[j];
            j++;
            index++;
        }

    }
    for(i=low;i<=high;i++)
        a[i]=temp[i];
        return c;

}
int merge_sort(int *a, int low, int high)
{
    int mid;
    if(low<high)
    {
        mid=(low+high)/2;
        merge_sort(a,low,mid);
        merge_sort(a,mid+1,high);
      int c=merge(a,low,mid,high);
      return c;
    }
}



int main()
{
  int t;
  cin>>t;
  while(t)
  {
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  int c=merge_sort(arr,0,n-1);
  for(int i=0;i<n;i++)
  {
    cout<<"  "<<arr[i]<<" ";
  }
  cout<<endl;
  cout<<"Comparisons: "<<c<<endl;
  t--;
}

}

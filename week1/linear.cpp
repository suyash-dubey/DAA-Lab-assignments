#include <iostream>
#include <vector>
//SUYASH DUBEY    SECTION C    2014907
using namespace std;

int main() {
    int n,size,ele,c=0,flag=0,find;
    cin >> n;
    //SUYASH DUBEY    SECTION C    2014907
    vector<vector<int>> v;
    for(int i=0; i<n; i++){
        cin >> size;
        vector<int> v1;
        for(int j=0; j<size; j++){
            cin >> ele;
            v1.push_back(ele);
        }
        v.push_back(v1);
        cin >> find;
        for(int z=0; z<v[i].size(); z++){
            if(find == v[i][z]){
                flag=1;
                break;
            }
            c++;
        }
        //SUYASH DUBEY    SECTION C    2014907
        if(flag!=0)
            cout << "Present: " <<c+1 <<"\n";
        else
            cout << "Not Present: "<< c<<"\n";
        flag=0;
        //SUYASH DUBEY    SECTION C    2014907
        c=0;
    }
